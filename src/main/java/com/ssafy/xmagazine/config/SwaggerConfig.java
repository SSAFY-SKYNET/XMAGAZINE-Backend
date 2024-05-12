package com.ssafy.xmagazine.config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI openAPI() {
        Info info = new Info().title("XMAGAZINE API").description("XMAGAZINE API 문서").version("v1");

        return new OpenAPI().components(new Components()).info(info);
    }

    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("v1-user")
                .pathsToMatch("/user/**")
                .build();
    }

    @Bean
    public GroupedOpenApi adminApi() {
        return GroupedOpenApi.builder()
                .group("v1-admin")
                .pathsToMatch("/admin/**")
                .build();
    }

    @Bean
    public GroupedOpenApi magazineApi() {
        return GroupedOpenApi.builder()
                .group("v1-magazine")
                .pathsToMatch("/magazine/**")
                .build();
    }

    @Bean
    public GroupedOpenApi commentApi() {
        return GroupedOpenApi.builder()
                .group("v1-comment")
                .pathsToMatch("/comment/**")
                .build();
    }

    @Bean
    public GroupedOpenApi contentApi() {
        return GroupedOpenApi.builder()
                .group("v1-content")
                .pathsToMatch("/content/**")
                .build();
    }

    @Bean
    public GroupedOpenApi locationApi() {
        return GroupedOpenApi.builder()
                .group("v1-location")
                .pathsToMatch("/location/**")
                .build();
    }

    @Bean
    public GroupedOpenApi pageApi() {
        return GroupedOpenApi.builder()
                .group("v1-page")
                .pathsToMatch("/page/**")
                .build();
    }

    @Bean
    public GroupedOpenApi attractionApi() {
        return GroupedOpenApi.builder()
                .group("v1-attraction")
                .pathsToMatch("/attraction/**")
                .build();
    }
}
