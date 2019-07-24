package com.lovejobs.search;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class TestFile {
    public static void main(String[] args) throws Exception {
        File file = new File("/Users/fengxin/Desktop/viedo");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String lines;
        StringBuffer sbf = new StringBuffer();
        while ((lines = reader.readLine()) != null) {
            lines = new String(lines.getBytes(), "utf-8");
            sbf.append(lines);
        }
        reader.close();
        JSONObject jsonObject = JSONObject.parseObject(sbf.toString());

        JSONArray jsonArray = jsonObject.getJSONArray("formats");

        Set<String> stringSet = new HashSet<String>();

        for (int i =0;i<jsonArray.size();i++) {
            JSONObject jsonObject1 =jsonArray.getJSONObject(i);

            String url= jsonObject1.getString("manifest_url");
            stringSet.add(url);
        }

        stringSet.forEach(s -> {
            String url =s;
            System.out.println(s);

        });

    }
}
