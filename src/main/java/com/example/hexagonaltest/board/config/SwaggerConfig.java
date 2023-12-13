package com.example.hexagonaltest.board.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@OpenAPIDefinition(
        info = @Info(
                title = "게시판 서비스 API 명세서",
                description = "헥사고날 아키텍처 기반의 게시판 서비스 API 명세서",
                version = "V1"
        )

)
@Configuration
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi getItem(){
    return GroupedOpenApi.builder()
            .group("게시판서비스")
            .pathsToMatch("/api")
            .build();

    }

}
