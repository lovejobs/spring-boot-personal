package com.lovejobs.self_reflect;

import java.util.stream.Stream;

public class TestReflectUserController {

    public static void main(String[] args) {
        UserController userController = new UserController();
        Class<? extends UserController> userControllerClass = userController.getClass();
        Stream.of(userControllerClass.getDeclaredFields()).forEach(field -> {
           if(field.getAnnotation(SelfReflect.class)!=null){
               field.setAccessible(true);
               Class<?> type = field.getType();
               try {
                   Object o = type.newInstance();
                   field.set(userController,o);
               } catch (InstantiationException e) {
                   e.printStackTrace();
               } catch (IllegalAccessException e) {
                   e.printStackTrace();
               }
           }
        });
        System.out.println(userController.getUserService());
    }
}
