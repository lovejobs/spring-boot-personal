package com.lovejobs.self_reflect;

import lombok.SneakyThrows;

import java.util.stream.Stream;

public class SelfReflectMain {
    @SneakyThrows
    public static void main(String[] args) {
        ReflectController reflectController = new ReflectController();
        Class<?> aClass = reflectController.getClass();
        Stream.of(aClass.getDeclaredFields()).forEach(field -> {
            if(field.getAnnotation(SelfReflect.class)!=null){
                field.setAccessible(true);
                Object o = null;
                try {
                    o = field.getType().newInstance();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
                try {
                    field.set(reflectController,o);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        });
        System.out.println(reflectController.getReflectService());
    }
}
