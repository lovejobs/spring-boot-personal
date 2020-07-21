package com.lovejobs.springbootaliyunoss;

import com.alibaba.fastjson.JSONObject;
import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.model.PutObjectRequest;
import com.aliyun.oss.model.PutObjectResult;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@SpringBootTest class SpringBootAliyunOssApplicationTests {

    private static String endpoint = "";
    private static String accessKeyId = "";
    private static String accessKeySecret = "";

    private static String bucketName = "";
    private static String key = "dist/";


    @Test void contextLoads() {
        OSS client = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
        boolean s = client.doesObjectExist(bucketName,"dist/");
        System.out.println(s);
        PutObjectResult r = client.putObject(new PutObjectRequest(bucketName, key+"js/modules/markdown.js", new File("/Users/fengxin/study_code/mblog/src/main/resources/static/dist/js/modules/markdown.js")));
        System.out.println(JSONObject.toJSONString(r));
    }

    public static void main(String[] args) {
        OSS client = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
        boolean s = client.doesObjectExist(bucketName,"dist/fengxin");
        System.out.println(s);
        listFile("/Users/fengxin/study_code/mblog/src/main/resources/static/dist",client);
    }

    private static void listFile(String file_path,OSS client){
        File file = new File(file_path);
        File[] files = file.listFiles();
        List<File> list = Arrays.asList(files);
        list.forEach(f -> {
            if(f.isFile()){
                String path = f.getAbsolutePath();
                String file_kay = path.substring(path.indexOf("static")+7);
                boolean s = client.doesObjectExist(bucketName,file_kay);
                if(!s){
                    client.putObject(new PutObjectRequest(bucketName, file_kay, new File(path)));
                }
            }else{
                listFile(f.getAbsolutePath(),client);
            }
        });
        System.out.println("处理完");
    }
}
