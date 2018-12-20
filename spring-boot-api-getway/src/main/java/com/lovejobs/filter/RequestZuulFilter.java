package com.lovejobs.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * 请求路由之前调用
 */
public class RequestZuulFilter extends ZuulFilter {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public String filterType() {
        return "pre";// 前置过滤器
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
        ctx.set("requestTime", new Date().getTime());// 设值，让下一个Filter看到上一个Filter的状态
        logger.info(String.format("%s %s request %s", request.getMethod(), request.getRequestURL().toString(), ctx.get("requestTime")));
        return null;
    }
}
