package com.example.GoogleMapPractice.service;

import com.example.GoogleMapPractice.domain.*;
import reactor.core.publisher.Mono;

public interface RoutesService {
    public Mono<String> computeRoutes(RouteRequestDto routeRequestDto);
}

