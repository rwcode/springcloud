package com.ranwei.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UserProviderApplication_8082 {
    public static void main(String[] args) {
        SpringApplication.run(UserProviderApplication_8082.class,args);
    }
}
