package com.jsonschema.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.jvx.trc","com.jsonschema.test"})
public class JsonschemaTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(JsonschemaTestApplication.class, args);
    }

}
