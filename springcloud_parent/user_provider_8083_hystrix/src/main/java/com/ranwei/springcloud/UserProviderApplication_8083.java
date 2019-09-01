package com.ranwei.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class UserProviderApplication_8083 {
    public static void main(String[] args) {
        SpringApplication.run(UserProviderApplication_8083.class,args);
    }
}
