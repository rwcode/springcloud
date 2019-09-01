package com.ranwei.springcloud.client;

import com.ranwei.springcloud.User;
import com.ranwei.springcloud.config.getUserByFeign;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component //交个Spring管理
public class getUBFHystrixFallbackFactory implements FallbackFactory<getUserByFeign> {
    public getUserByFeign create(Throwable throwable) {
        return new getUserByFeign() {
            public User getUser(Long id) {
                return new User(id,"程序异常，请联系管理员！");
            }
        };
    }
}
