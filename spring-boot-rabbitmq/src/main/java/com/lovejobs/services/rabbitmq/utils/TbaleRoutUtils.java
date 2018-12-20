package com.lovejobs.services.rabbitmq.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * 平衡性的一致性hash算法 获取表路由
 */
public class TbaleRoutUtils {

    private static MessageDigest md5 = null;

    public static long getTableRout(String key){
        return hash(key)%11;
    }

    public static long hash(String key) {
        if (md5 == null) {
            try {
                md5 = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException e) {
                throw new IllegalStateException("no md5 algrithm found");
            }
        }

        md5.reset();
        md5.update(key.getBytes());
        byte[] bKey = md5.digest();
        long result = ((long) (bKey[3] & 0xFF) << 24)
                | ((long) (bKey[2] & 0xFF) << 16
                | ((long) (bKey[1] & 0xFF) << 8) | (long) (bKey[0] & 0xFF));
        return result & 0xffffffffL;
    }

    public static void main(String atgs[]){

        Map<String,Integer> map = new HashMap<String,Integer>();
        for (int i =0 ;i<100000 ;i++){
            UUID uuid = UUID.randomUUID();
            String strID = uuid.toString().replaceAll("-", "");
            System.out.println(strID);
            String hashcode =String.valueOf(hash(strID)%11);
            if(map.get(hashcode)==null){
                map.put(hashcode,0);
            }else{
                map.put(hashcode,map.get(hashcode)+1);
            }
        }
        System.out.println(map.toString());

    }
}
