package com.zerobase.api.config

import io.swagger.v3.oas.annotations.OpenAPIDefinition
import io.swagger.v3.oas.annotations.info.Info
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer


@OpenAPIDefinition(
    info = Info(
        title = "Swagger",
        description = "fintech",
        version = "1.0"
    )
)

@Configuration
class SwaggerConfig : WebMvcConfigurer {
    // http://localhost:8080/swagger-ui/index.html
//    @Bean
//    fun api() : Docket {
//        return Docket(DocumentationType.OAS_30)
//            .useDefaultResponseMessages(false)
//            .select()
//            .apis(RequestHandlerSelectors.basePackage("com.zerobase.api"))
//            .paths(PathSelectors.any())
//            .build()
//            .apiInfo(apiInfo())
//    }
//
//    private fun apiInfo(): ApiInfo {
//        return ApiInfoBuilder()
//            .title("Swagger")
//            .description("fintech")
//            .version("1.0")
//            .build()
//    }


}