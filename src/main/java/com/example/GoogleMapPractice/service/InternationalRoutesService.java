package com.example.GoogleMapPractice.service;

import com.example.GoogleMapPractice.domain.RouteRequestDto;
import org.json.JSONObject;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
@Profile("international")
public class InternationalRoutesService implements RoutesService {
    private final String apiKey = System.getenv("GOOGLE_API_KEY");
    private final WebClient webClient;

    public InternationalRoutesService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://routes.googleapis.com").build();
    }
    @Override
    public Mono<String> computeRoutes(RouteRequestDto routeRequestDto) {
        JSONObject json = routeRequestDto.toEntity().toGoogleJson();
        json.put("travelMode", "WALK");
        json.put("routingPreference", "ROUTING_PREFERENCE_UNSPECIFIED");
        json.put("computeAlternativeRoutes", false);
        json.put("languageCode", "en-US");
        json.put("units", "METRIC");


        String requestBody = json.toString();

        return webClient.post()
                .uri("/directions/v2:computeRoutes")
                .header("Content-Type", "application/json")
                .header("X-Goog-Api-Key", apiKey)
                .header("X-Goog-FieldMask", "routes.duration,routes.distanceMeters,routes.polyline.encodedPolyline")
                .body(Mono.just(requestBody), String.class)
                .retrieve()
                .bodyToMono(String.class);
    }
}
