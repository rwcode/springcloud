package com.ranwei.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.ranwei.springcloud.config")
//因为getUserByFengn和入口类的包名相同，会编译到一起，可以不用导入
public class UserConsumerApplication_9093 {
    public static void main(String[] args) {
        SpringApplication.run(UserConsumerApplication_9093.class,args);
    }
}
