package com.lovejobs.springbootfeign.controller;

import com.alibaba.fastjson.JSONObject;
import com.lovejobs.springbootfeign.model.AuthTokenRequest;
import com.lovejobs.springbootfeign.model.AuthTokenResponse;
import com.lovejobs.springbootfeign.remote.AuthTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    AuthTokenService authTokenService;

    @RequestMapping(value = "/remove", method = RequestMethod.GET)
    public void feign(){
        AuthTokenRequest authTokenRequest = new AuthTokenRequest();
        AuthTokenResponse o = authTokenService.getAuthTokenV2(authTokenRequest.getStr());
        System.out.println(JSONObject.toJSONString(o));
    }
}
