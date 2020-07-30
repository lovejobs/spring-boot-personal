package com.lovejobs.springbootfeigntest;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: fengxin
 * @version: 1.0
 * @description: 请求对象
 * @date: 2020/7/30
 **/
@Data
public class FeignRequest implements Serializable {
    private static final long serialVersionUID = 6712379467254898668L;

    private String name;

    private Integer id;

    public FeignRequest(String name, Integer id) {
        this.name = name;
        this.id = id;
    }
}
