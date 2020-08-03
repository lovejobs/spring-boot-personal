package com.lovejobs.springbootlombok.model;

import lombok.*;

import javax.annotation.security.DenyAll;
import java.io.*;

/**
 * @description: Lombok main
 * @author: fengxin
 * @date: 2020/8/1
 **/
public class LombokDemoMain {

    public static final String PATH = "/Users/fengxin/study_code/spring-boot-personal/spring-boot-lombok/src/main/java/com/lovejobs/springbootlombok/model/LombokDemoMain.java";

    /**
     * 使用Lombok注解
     */
    @SneakyThrows
    private static void readFileWithAnnotation(){
        File file = new File(PATH);
        @Cleanup
        InputStream ins = new FileInputStream(file);
        int len;
        byte[] bs = new byte[1024];
        while ((len = ins.read(bs)) != -1){
            System.out.println("content"+ new String(bs,0,len));
        }
    }

    /**
     * 使用常用注解
     */
    private static void readFileNoAnnotation(){
        File file = new File(PATH);

        InputStream ins = null;
        try {
            ins = new FileInputStream(file);
            int len;
            byte[] bs = new byte[1024];
            while ((len = ins.read(bs)) != -1){
                System.out.println("content"+ new String(bs,0,len));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            try {
                ins.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    static class LombokDemo{
        private String name;
        private String verion;
    }

    public static void main(String[] args) {
        LombokDemo lombokDemo = LombokDemo.builder().name("Lombok").verion("3.1.0").build();
        LombokDemo lombokDemo_1 = new LombokDemo("Lombok","3.1.0");
        LombokDemo lombokDemo_2 = new LombokDemo();
    }
}
