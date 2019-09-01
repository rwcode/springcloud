package com.ranwei.springcloud.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;

@Component
public class LoginFilter extends ZuulFilter {
    public String filterType() {
        return "pre";
    }

    public int filterOrder() {
        return 1;
    }

    public boolean shouldFilter() {
        //过滤器是否生效
        return true;
    }

    public Object run() throws ZuulException {
        //获取上线文请求
        RequestContext currentContext = RequestContext.getCurrentContext();
        //拿到请求request对象
        HttpServletRequest request = currentContext.getRequest();
        //获取请求头中的token
        String token = request.getHeader("token");
        //判断token  是否登录
        if (token==null| StringUtils.isEmpty(token)) {
            currentContext.setSendZuulResponse(false);
            currentContext.setResponseStatusCode(HttpStatus.SC_UNAUTHORIZED);
        }
        return null;
    }
}
