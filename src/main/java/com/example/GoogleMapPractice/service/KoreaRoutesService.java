package com.example.GoogleMapPractice.service;

import com.example.GoogleMapPractice.domain.RouteRequestDto;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
@Profile("korea")
public class KoreaRoutesService implements RoutesService{
    private final String apiKey = System.getenv("TMAP_API_KEY");
    private final WebClient webClient;

    public KoreaRoutesService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://apis.openapi.sk.com").build();
    }
    @Override
    public Mono<String> computeRoutes(RouteRequestDto routeRequestDto) {
        MultiValueMap<String, String> formData = routeRequestDto.toEntity().toTmapValueMap();
        formData.add("speed", "35");
        formData.add("startName", "origin");
        formData.add("endName", "destination");

        return webClient.post()
                .uri("/tmap/routes/pedestrian?version=1")
                .header("Content-Type", "application/x-www-form-urlencoded")
                .header("appKey", apiKey)
                .header("Accept-Language", "ko")
                .bodyValue(formData)
                .retrieve()
                .bodyToMono(String.class);
    }
}
