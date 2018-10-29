package com.trelobifteki.demo.backend.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by lambros on 27.10.18.
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**").addResourceLocations("classpath:META-INF/resources/webjars/ui/1.0/");
        registry.addResourceHandler("/ui/**").addResourceLocations("classpath:META-INF/resources/webjars/ui/1.0/");
    }
}
