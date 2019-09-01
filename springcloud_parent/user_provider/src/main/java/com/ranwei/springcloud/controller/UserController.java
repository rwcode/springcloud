package com.ranwei.springcloud.controller;

import com.ranwei.springcloud.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provider")
public class UserController {
    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Long id){
        return new User(id,"zhangsan-8081");
    }
}
