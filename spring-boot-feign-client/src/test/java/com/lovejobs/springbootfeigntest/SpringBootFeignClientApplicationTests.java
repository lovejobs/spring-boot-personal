package com.lovejobs.springbootfeigntest;

import com.alibaba.fastjson.JSONObject;
import com.lovejobs.springbootfeigntest.service.AuthTokenService;
import com.lovejobs.springbootfeigntest.service.FeignService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest class SpringBootFeignClientApplicationTests {

    @Autowired FeignService feignService;

    @Autowired
    AuthTokenService authTokenService;

    @Test void contextLoads() {
        FeignRequest feignRequest = new FeignRequest("fengxin",1);
        FeignResponse feignResponse = feignService.feign(feignRequest);
        System.out.println(JSONObject.toJSONString(feignResponse));
    }

    @Test void contextLoads2() {
        AuthTokenResponse o = authTokenService.getAuthToken(new AuthTokenRequest());
        System.out.println(JSONObject.toJSONString(o));
    }

    @Test void contextLoads23() {
        AuthTokenRequest authTokenRequest = new AuthTokenRequest();
        AuthTokenResponse o = authTokenService.getAuthTokenV2(authTokenRequest.getStr());
        System.out.println(JSONObject.toJSONString(o));
    }

}
