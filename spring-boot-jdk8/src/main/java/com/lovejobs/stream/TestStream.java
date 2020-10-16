package com.lovejobs.stream;

import lombok.Cleanup;
import lombok.SneakyThrows;

import java.io.*;
import java.nio.charset.Charset;

/**
 * The type Test stream.
 * @author fengxin
 */
public class TestStream {

    @SneakyThrows
    public static void readStream(){
        @Cleanup
        InputStream inputStream = new FileInputStream("stream.txt");
        @Cleanup
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        byte[] bytes = new byte[1024];
        int bytesRead = 0;
        while ((bytesRead = inputStream.read(bytes))!=-1) {
            outputStream.write(bytes,0,bytesRead);
        }
        String data = outputStream.toString("UTF-8");
        System.out.println(data);
    }

    @SneakyThrows
    public static void writeStream(){
        @Cleanup
        OutputStream outputStream = new FileOutputStream("stream.txt");
        String s = "hello fengxin";
        byte[] bytes = s.getBytes(Charset.forName("UTF-8"));
        outputStream.write(bytes);
    }

    public static void main(String[] args) {
        //writeStream();
        readStream();
    }
}
