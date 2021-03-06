package com.microservices_app.postservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@MapperScan("com.microservices_app.postservice.**.mapper")
@SpringBootApplication
public class PostserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PostserviceApplication.class, args);
    }

}
