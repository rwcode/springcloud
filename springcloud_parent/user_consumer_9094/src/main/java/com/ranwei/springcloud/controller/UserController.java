package com.ranwei.springcloud.controller;

import com.ranwei.springcloud.User;
import com.ranwei.springcloud.config.getUserByFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
public class UserController {

    @Autowired
    private getUserByFeign userByFeign;
    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Long id){
        return userByFeign.getUser(id);
    }



}
