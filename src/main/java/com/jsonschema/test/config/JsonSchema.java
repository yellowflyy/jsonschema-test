package com.jsonschema.test.config;

import com.jvx.trc.config.JsonSchemaConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

@Configuration
public class JsonSchema {

    @Resource
    private JsonSchemaConfig jsonSchemaConfig;

    @Bean
    public void beanFactory(){
        System.out.println("------------------------------");
        jsonSchemaConfig.jsonSchemaToJavaBean();
    }
}
