package com.example.graduationdesign.config;
//注意，下面的配置中的一些信息无关紧要，主要是对knife4j主页中的介绍中的一些配置


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
