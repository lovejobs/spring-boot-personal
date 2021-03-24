package com.lovejobs.springbootkafka.pojo;

import lombok.Data;

@Data
public class UserPojo {
    private String name;
    private Integer age;
    private String desc;


    public UserPojo(String name, Integer age, String desc) {
        this.name = name;
        this.age = age;
        this.desc = desc;
    }
}
