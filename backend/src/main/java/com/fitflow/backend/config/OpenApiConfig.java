package com.fitflow.backend.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI fitflowOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("FitFlow API")
                        .description("API para gestionar hábitos")
                        .version("v1"))
                .externalDocs(new ExternalDocumentation()
                        .description("Documentación del proyecto")
                        .url("https://github.com/galindojoan/FitFlow"));
    }
}