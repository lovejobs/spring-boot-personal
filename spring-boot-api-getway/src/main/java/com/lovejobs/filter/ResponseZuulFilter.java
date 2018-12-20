package com.lovejobs.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

/**
 * 请求路由之后调用
 */
public class ResponseZuulFilter extends ZuulFilter {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public String filterType() {
        return "post";// 前置过滤器
    }

    @Override
    public int filterOrder() {
        return 0;// 优先级为0，数字越大，优先级越低
    }

    @Override
    public boolean shouldFilter() {
        return true;// 是否执行该过滤器，此处为true，说明需要过滤
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        HttpServletResponse response =ctx.getResponse();
        logger.info(String.format("%s %s response taking time %s status %s", request.getMethod(), request.getRequestURL().toString(), new Date().getTime()-Long.valueOf(String.valueOf(ctx.get("requestTime"))),response.getStatus()));
        return null;
    }
}
