package com.lovejobs.springbootfeign;


import com.alibaba.fastjson.JSONObject;
import com.lovejobs.springbootfeign.model.AuthTokenRequest;
import com.lovejobs.springbootfeign.model.AuthTokenResponse;
import com.lovejobs.springbootfeign.remote.AuthTokenService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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
        AuthTokenResponse o = authTokenService.getAuthToken(new AuthTokenRequest());
        System.out.println(JSONObject.toJSONString(o));
    }
}
