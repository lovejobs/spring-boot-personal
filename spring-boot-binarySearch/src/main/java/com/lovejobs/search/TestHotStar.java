package com.lovejobs.search;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class TestHotStar{

    public static void main(String[] args) throws Exception {
        StringBuffer sbf = new StringBuffer();
        try {
            URL url = new URL("https://hssportsprepack.akamaized.net/videos/cricket/icccwc2019/19_05_2019/2001631572/master_Layer1.m3u8");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestProperty("User-Agent","Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/39.0.2171.95 Safari/537.36");

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String lines;
            while ((lines = reader.readLine()) != null) {
                lines = new String(lines.getBytes(), "utf-8");
                System.out.println(lines);
                sbf.append(lines);
            }
            reader.close();
            connection.disconnect();
        } catch (Exception e) {

            e.printStackTrace();

        }



    }


}
