package com.lovejobs.interview.jar;

import com.alibaba.fastjson.JSONObject;
import com.lovejobs.interview.frame.AbstractConfig;
import org.springframework.stereotype.Component;

@Component
public class SonConfig implements AbstractConfig<String> {
    @Override
    public void onMessage(String s) {
        SonVO f = JSONObject.parseObject(s,SonVO.class);
        System.out.println(f.toString());
    }
}
