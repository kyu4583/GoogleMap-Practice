package com.example.GoogleMapPractice.controller;

import com.example.GoogleMapPractice.domain.RouteRequestDto;
import com.example.GoogleMapPractice.service.RoutesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1/routes")
public class RoutesController {

    private final RoutesService routesService;

    @Autowired
    public RoutesController(RoutesService routesService) {
        this.routesService = routesService;
    }

    @PostMapping("/computeRoutes")
    public Mono<String> getRoutes(@RequestBody RouteRequestDto routeRequestDto) {
        return routesService.computeRoutes(routeRequestDto);
    }
}
