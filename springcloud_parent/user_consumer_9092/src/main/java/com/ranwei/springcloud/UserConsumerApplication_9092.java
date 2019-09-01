package com.ranwei.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UserConsumerApplication_9092 {

   /* @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate(new OkHttp3ClientHttpRequestFactory());
    }*/
    public static void main(String[] args) {
        SpringApplication.run(UserConsumerApplication_9092.class,args);
    }
}
