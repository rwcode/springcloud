package com.ranwei.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.ranwei.springcloud.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provider")
public class UserController {
    @HystrixCommand(fallbackMethod = "fallBack")
    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Long id){
        if (id==2) {
            throw new RuntimeException("报错了哟！");
        }
        return new User(id,"zhangsan-8083");
    }
    public User fallBack(Long id){
        return new User(id,"User Not Found！！！");
    }
}
