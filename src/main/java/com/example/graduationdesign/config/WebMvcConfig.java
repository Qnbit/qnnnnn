//package com.example.graduationdesign.config;
//
//import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//
////swagger配置
//@Slf4j
//@Configuration
////@EnableSwagger2
//@EnableKnife4j
//public class WebMvcConfig extends WebMvcConfigurationSupport {
//
////    @Override
////    protected void addResourceHandlers(ResourceHandlerRegistry requestHandlerSelectors) {
////        log.info("静态资源映射");
//////        addResourceHandler("/**")
//////             .addResourceLocations("classpath:/static/");
//////        requestHandlerSelectors.addResourceHandler("swagger-ui.html")
////        requestHandlerSelectors.addResourceHandler("doc.html").addResourceLocations("classpath:/META-INF/resources/");
//////        requestHandlerSelectors.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
//////        requestHandlerSelectors.addResourceHandler("/backend/**").addResourceLocations("classpath:/backend/");
//////        requestHandlerSelectors.addResourceHandler("/front/**").addResourceLocations("classpath:/front/");
////
////
////    }
//
//    @Bean
//    public Docket createRestApi() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .apiInfo(apiInfo())
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.example.graduationdesign.controller"))
//                .paths(PathSelectors.any())
//                .build();
//
//    }
//    private ApiInfo apiInfo(){
//        return new ApiInfoBuilder()
//                .title("Graduation Design")
//                .version("1.0")
//                .description("毕业设计接口文档")
//                .build();
//    };
//}
