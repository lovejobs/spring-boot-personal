package com.lovejobs.interview.jar;

import com.alibaba.fastjson.JSONObject;
import com.lovejobs.interview.frame.AbstractConfig;
import org.springframework.stereotype.Component;

@Component
public class FatherConfig implements AbstractConfig<String> {
    @Override
    public void onMessage(String s) {
        FatherVO f = JSONObject.parseObject(s,FatherVO.class);
        System.out.println(f.toString());
    }
}
