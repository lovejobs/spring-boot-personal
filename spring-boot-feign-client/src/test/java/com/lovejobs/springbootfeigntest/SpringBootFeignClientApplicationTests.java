package com.lovejobs.springbootfeigntest;

import com.alibaba.fastjson.JSONObject;
import com.lovejobs.springbootfeigntest.FeignRequest;
import com.lovejobs.springbootfeigntest.FeignResponse;
import com.lovejobs.springbootfeigntest.service.FeignService;
import com.shareit.common.Result;
import com.shareit.mcp.service.CdnConfigRemoteService;
import com.shareit.mcp.vo.GetConfigRequest;
import com.shareit.mcp.vo.GetConfigResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest class SpringBootFeignClientApplicationTests {

    @Autowired FeignService feignService;

    @Autowired CdnConfigRemoteService cdnConfigRemoteService;

    @Test void contextLoads() {
        FeignRequest feignRequest = new FeignRequest("fengxin",1);
        FeignResponse feignResponse = feignService.feign(feignRequest);
        System.out.println(JSONObject.toJSONString(feignResponse));
    }

}
