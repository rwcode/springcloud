package com.ranwei.springcloud.controller;

import com.ranwei.springcloud.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/consumer")
public class UserController {
    //多个方法调用只需改一处就ok
    public static  final String URL_PREFIX = "http://USER-PROVIDER";
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Long id){
        String url = URL_PREFIX+"/provider/user/"+id;
        System.out.println(url);
        return restTemplate.getForObject(url,User.class );
    }



}
