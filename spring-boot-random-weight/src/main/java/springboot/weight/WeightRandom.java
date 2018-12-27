package springboot.weight;

import java.util.*;

public class WeightRandom {

    private static int acount=0;
    private static int bcount=0;
    private static int ccount=0;
    private static int dcount=0;

    public static void main(String[] args) {
        Random ran = new Random();
        String str=getWanfei(ran.nextInt(100));
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("key","A");
        map.put("value","0");
        Map<String,Object> map1 = new HashMap<String,Object>();
        map1.put("key","B");
        map1.put("value","1");
        Map<String,Object> map2 = new HashMap<String,Object>();
        map2.put("key","C");
        map2.put("value","20");
        Map<String,Object> map3 = new HashMap<String,Object>();
        map3.put("key","D");
        map3.put("value","60");
        List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
        list.add(map2);
        list.add(map);
        list.add(map1);
        list.add(map3);
        for (int i =0;i<=1000;i++) {
            getWeight(list,ran.nextInt(100)+1);
            System.out.println(acount+"__"+bcount+"__"+ccount+"__"+dcount);
        }

    }
    //知道权重的情况下
    public static String getWanfei(int num){
        if(num>=1 && num<=30){
            return "A";
        }else if(num>=31 && num<70){
            return "B";
        }else{
            return "C";
        }
    }

    //如果A、B、C的个数不确定 ，权重的总数也也不确定

    public static String getWeight(List<Map<String,Object>> list,int ran){
        //map里放的是a,b,c 值，和每个a、b、c对应的权重
        int sum=0;
        int total = list.size();
        for(int i=0;i<total;i++){
            sum+=Integer.parseInt(list.get(i).get("value").toString());
            if(ran<=sum){
                String result = list.get(i).get("key").toString();
                if(result=="A"){
                    acount=acount+1;
                }else if(result=="B"){
                    bcount = bcount+1;
                }else if(result=="C"){
                    ccount = ccount +1;
                }else {
                    dcount = dcount +1;
                }
                return "";
            }
        }
        return null;
    }
}
