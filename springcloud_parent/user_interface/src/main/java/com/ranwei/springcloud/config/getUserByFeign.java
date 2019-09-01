package com.ranwei.springcloud.config;

import com.ranwei.springcloud.User;
import com.ranwei.springcloud.client.getUBFHystrixFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "USER-PROVIDER",fallbackFactory = getUBFHystrixFallbackFactory.class)
//@FeignClient(value = "USER-PROVIDER")
@RequestMapping("/provider")
public interface getUserByFeign {
    @RequestMapping("/user/{id}")
    User getUser(@PathVariable("id") Long id);
}
