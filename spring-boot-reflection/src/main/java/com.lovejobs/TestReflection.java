package com.lovejobs;

import com.alibaba.fastjson.JSONObject;

import java.lang.reflect.Field;

public class TestReflection {

    public static Object getFieldValueByFieldName(String fieldName,Object object){
        try {
            Field field = object.getClass().getDeclaredField(fieldName);
            field.setAccessible(true);
            return field.get(object);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void setFieldValueByFieldName(String fieldName,Object object,Object value){
        try {
            Field field = object.getClass().getDeclaredField(fieldName);
            field.setAccessible(true);
            field.set(object,value);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        Person person = new Person("fengxin",28);
        System.out.println(getFieldValueByFieldName("name",person));
        System.out.println(getFieldValueByFieldName("age",person));

        setFieldValueByFieldName("name",person,"fengxin2");
        setFieldValueByFieldName("age",person,12);

        System.out.println(getFieldValueByFieldName("name",person));
        System.out.println(getFieldValueByFieldName("age",person));
    }
}
