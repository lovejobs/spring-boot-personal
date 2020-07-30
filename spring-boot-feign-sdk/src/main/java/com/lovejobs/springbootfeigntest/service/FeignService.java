package com.lovejobs.springbootfeigntest.service;

import com.lovejobs.springbootfeigntest.FeignRequest;
import com.lovejobs.springbootfeigntest.FeignResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.awt.*;

/**
 * @author fengxin
 */
@FeignClient(url = "http://localhost:8443", name = "feignService")
public interface FeignService {

    @RequestMapping(value = "/feign/index", method = RequestMethod.GET)
    void feign();

    @RequestMapping(value = "/feign/index1", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    FeignResponse feign(@RequestBody FeignRequest feignRequest);
}
