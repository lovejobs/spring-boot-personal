package com.lovejobs.springbootfeigntest.controller;

import com.alibaba.fastjson.JSONObject;
import com.lovejobs.springbootfeigntest.FeignRequest;
import com.lovejobs.springbootfeigntest.FeignResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: fengxin
 * @version: 1.0
 * @description: Feign测试服务端
 * @date: 2020/7/30
 **/
@RestController
public class FeignController {

    @RequestMapping(value = "/feign/index", method = RequestMethod.GET)
    public void feign(){
        System.out.println("fengxin");
    }

    @RequestMapping(value = "/feign/index1", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public FeignResponse feign(@RequestBody FeignRequest feignRequest){
        System.out.println(JSONObject.toJSONString(feignRequest));
        return new FeignResponse("feign","feign result");
    }
}
