package com.example.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudConfig {


    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {

        return builder.routes()

                .route("CandidatApiApplication", r->r.path("/candidats/**")
                        .uri("http://localhost:8082/"))
                .route("JobApiApplication", r->r.path("/jobs/**")
                        .uri("http://localhost:8080/"))

                .build();
    }
}