package com.ranwei.springcloud.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class MyConfigBean {
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
