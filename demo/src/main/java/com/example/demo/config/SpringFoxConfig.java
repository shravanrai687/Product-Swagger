package com.example.demo.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SpringFoxConfig {                                    
    @Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()                                  
          .apis(RequestHandlerSelectors.basePackage("com.example.demo"))              
         // .paths(PathSelectors.ant("/product/*"))                          
          .build()
          .apiInfo(apiDetails());                                           
    }
    
    private ApiInfo apiDetails()
    {
		return new ApiInfo("Product-Details", 
				"Sample API for Product-Details",
				"1.0",
				null, 
				null, 
				null, 
				"API License",
				Collections.emptyList());
    }
}