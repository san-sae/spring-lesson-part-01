package com.sparta.msa.lesson.global.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition(
    info = @Info(title = "My API Docs", description = "API 명세서", version = "v1")
)

// @Configuration 설정으로 인해 해당 클래스는 설정 클래스가 된다.
// Spring이 프로그램이 시작되면 @Configuration이 붙은 클래스를 읽고 해당 설정 세팅을 완료
@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI openAPI() {
        String jwtSchemeName = "jwtAuth";
        SecurityRequirement securityRequirement = new SecurityRequirement().addList(jwtSchemeName);
        // Swagger 문서에서 API 호출시, 아래 내용을 헤더에 넣어 보내주겠다는 설정
        // 아래 부분이 있으면 스웨거 문서에서 자물쇠 버튼(Authorize)이 유의미하게 동작
        Components components = new Components()
            .addSecuritySchemes(jwtSchemeName, new SecurityScheme()
                .name(jwtSchemeName)
                .type(SecurityScheme.Type.HTTP) // HTTP 방식
                .scheme("bearer") // bearer 토큰 방식
                .bearerFormat("JWT")); // 토큰 형식

        return new OpenAPI()
            .addSecurityItem(securityRequirement)
            .components(components);
    }
}








