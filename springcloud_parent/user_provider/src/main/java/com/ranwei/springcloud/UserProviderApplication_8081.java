package com.ranwei.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class UserProviderApplication_8081 {
    public static void main(String[] args) {
        SpringApplication.run(UserProviderApplication_8081.class,args);
    }
}
