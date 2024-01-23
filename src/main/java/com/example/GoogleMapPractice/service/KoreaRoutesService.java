package com.example.GoogleMapPractice.service;

import com.example.GoogleMapPractice.domain.RouteRequestDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.io.IOException;

@Service
@Profile("korea")
public class KoreaRoutesService implements RoutesService{
    @Value("${TMAP_API_KEY}")
    private String apiKey;
    private final WebClient webClient;

    public KoreaRoutesService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://apis.openapi.sk.com").build();
    }
    @Override
    public Mono<String> computeRoutes(RouteRequestDto routeRequestDto) {
        MultiValueMap<String, String> requestBody = buildRequestBody(routeRequestDto);

        return postAPIRequest(requestBody)
                .flatMap(response -> {
                    try {
                        ObjectNode parsedResponse = parseApiResponse(response);
                        return Mono.just(encodePolyline(parsedResponse).toString());
                    } catch (IOException e) {
                        return Mono.error(new RuntimeException(e));
                    }
                });
    }

    private MultiValueMap<String, String> buildRequestBody(RouteRequestDto routeRequestDto) {
        MultiValueMap<String, String> formData = routeRequestDto.toEntity().toTmapValueMap();
        formData.add("speed", "35");
        formData.add("startName", "origin");
        formData.add("endName", "destination");
        return formData;
    }

    private Mono<String> postAPIRequest(MultiValueMap<String, String> requestBody) {
        return webClient.post()
                .uri("/tmap/routes/pedestrian?version=1")
                .header("Content-Type", "application/x-www-form-urlencoded")
                .header("appKey", apiKey)
                .header("Accept-Language", "ko")
                .bodyValue(requestBody)
                .retrieve()
                .bodyToMono(String.class);
    }

    private ObjectNode parseApiResponse(String apiResponse) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode rootNode = mapper.readTree(apiResponse);

        JsonNode features = rootNode.path("features");
        JsonNode properties = features.get(0).path("properties");
        double totalDistance = properties.path("totalDistance").asDouble();
        int totalTime = properties.path("totalTime").asInt();

        ObjectNode result = mapper.createObjectNode();
        ArrayNode coordinatesArray = mapper.createArrayNode();

        for (JsonNode feature : features) {
            JsonNode geometry = feature.path("geometry");
            JsonNode coordinates = geometry.path("coordinates");

            if (geometry.path("type").asText().equals("Point")) {
                double latitude = coordinates.get(1).asDouble();
                double longitude = coordinates.get(0).asDouble();
                coordinatesArray.add(mapper.createObjectNode().put("latitude", latitude).put("longitude", longitude));
            } else if (geometry.path("type").asText().equals("LineString")) {
                for (JsonNode coordinate : coordinates) {
                    double latitude = coordinate.get(1).asDouble();
                    double longitude = coordinate.get(0).asDouble();
                    coordinatesArray.add(mapper.createObjectNode().put("latitude", latitude).put("longitude", longitude));
                }
            }
        }

        result.set("coordinates", coordinatesArray);
        result.put("totalTimeSeconds", totalTime);
        result.put("totalDistanceMeters", totalDistance);

        return result;
    }

    private ObjectNode encodePolyline(ObjectNode coordinates) throws IOException {

        String polyline =  new PolylineEncoder().encode(coordinates.path("coordinates"));

        ObjectNode result = new ObjectMapper().createObjectNode();
        result.put("encodedPolyline", polyline);
        result.put("totalTimeSeconds", coordinates.path("totalTimeSeconds").asInt());
        result.put("totalDistanceMeters", coordinates.path("totalDistanceMeters").asDouble());

        return result;
    }
}
