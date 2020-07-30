package com.lovejobs.springbootfeigntest;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: fengxin
 * @version: 1.0
 * @description: 返回结果测试类
 * @date: 2020/7/30
 **/
@Data
public class FeignResponse implements Serializable {
    private static final long serialVersionUID = 8022265162103568121L;

    private String name;

    private String result;

    public FeignResponse(String name, String result) {
        this.name = name;
        this.result = result;
    }
}
