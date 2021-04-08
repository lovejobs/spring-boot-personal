package com.lovejobs.interview.jar;

import lombok.Data;

@Data
public class SonVO {
    private String name;
    private Integer age;
    private String angel = "son";

    @Override
    public String toString() {
        return "SonVO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", angel='" + angel + '\'' +
                '}';
    }
}
