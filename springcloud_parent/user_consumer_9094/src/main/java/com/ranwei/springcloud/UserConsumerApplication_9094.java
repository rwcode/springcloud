package com.ranwei.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class UserConsumerApplication_9094 {
    public static void main(String[] args) {
        SpringApplication.run(UserConsumerApplication_9094.class,args);
    }
}
