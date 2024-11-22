package com.example.graduationdesign.config;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Knife4jConfig {

    @Bean
    public OpenAPI customOpenAPI() {

        return new OpenAPI()
                .info(new Info()
                        .title("graduationDesign")
                        .version("1.0")
                        .description("毕业设计")
                        .contact(new Contact()
                                .name("Uber bit")
                                .url("https://test.com")
                                .email("2695967522@qq.com")
                        ));

    }
}
