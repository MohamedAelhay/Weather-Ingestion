package com.example.ingestionv1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@EnableFeignClients
@SpringBootApplication
public class IngestionV1Application {

    public static void main(String[] args) {
        SpringApplication.run(IngestionV1Application.class, args);
    }

}
