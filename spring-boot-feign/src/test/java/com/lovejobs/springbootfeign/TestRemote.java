package com.lovejobs.springbootfeign;


import com.alibaba.fastjson.JSONObject;
import com.lovejobs.springbootfeign.model.AuthTokenRequest;
import com.lovejobs.springbootfeign.model.AuthTokenResponse;
import com.lovejobs.springbootfeign.remote.AuthTokenService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestRemote {

    @Autowired
    AuthTokenService authTokenService;

    @Test
    public void testInit(){
        System.out.println("fengxin");
    }

    @Test
    public void contextLoads2() {
        AuthTokenRequest authTokenRequest = new AuthTokenRequest();
        AuthTokenResponse o = authTokenService.getAuthTokenV2(authTokenRequest.getStr());
        System.out.println(JSONObject.toJSONString(o));
    }

    @Test
    public void contextLoads22() {
        AuthTokenResponse o = authTokenService.getAuthToken(new AuthTokenRequest());
        System.out.println(JSONObject.toJSONString(o));
    }
}
