package com.lovejobs.interview.jar;

import lombok.Data;

@Data
public class FatherVO {
    private String name;
    private Integer age;
    private String angel = "father";

    @Override
    public String toString() {
        return "FatherVO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", angel='" + angel + '\'' +
                '}';
    }
}
