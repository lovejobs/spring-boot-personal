package com.lovejobs.vo;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.util.BeanUtil;
import org.springframework.beans.BeanUtils;

public class TestBeanutils {

    public static void main(String[] args) {
        Son son = new Son(1,"son");

        Father father = new Father(2,"father",son);
        Mother mother = new Mother();
        BeanUtils.copyProperties(father,mother);
        System.out.println(JSONObject.toJSONString(mother));
    }
}
