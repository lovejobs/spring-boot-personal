package springboot.weight;

import org.apache.commons.lang3.RandomUtils;

import java.util.*;

public class WeightRandom {

    private static int acount=0;
    private static int bcount=0;
    private static int ccount=0;
    private static int dcount=0;

    public static void main(String[] args) {
        Random ran = new Random();
        Map<String,Object> cashback_map_1 = new HashMap<String,Object>();
        cashback_map_1.put("rewardType","CASHBACK");
        cashback_map_1.put("weight","35");
        cashback_map_1.put("rewardRangeStart","3");
        cashback_map_1.put("rewardRangeEnd","4");
        Map<String,Object> cashback_map_2 = new HashMap<String,Object>();
        cashback_map_2.put("rewardType","CASHBACK");
        cashback_map_2.put("weight","5");
        cashback_map_2.put("rewardRangeStart","10");
        cashback_map_2.put("rewardRangeEnd","12");
        Map<String,Object> cashback_map_3 = new HashMap<String,Object>();
        cashback_map_3.put("rewardType","CASHBACK");
        cashback_map_3.put("weight","1");
        cashback_map_3.put("rewardRangeStart","50");
        cashback_map_3.put("rewardRangeEnd","50");
        Map<String,Object> coins_map_1 = new HashMap<String,Object>();
        coins_map_1.put("rewardType","COINS");
        coins_map_1.put("weight","4");
        coins_map_1.put("rewardRangeStart","100");
        coins_map_1.put("rewardRangeEnd","300");
        Map<String,Object> coins_map_2 = new HashMap<String,Object>();
        coins_map_2.put("rewardType","COINS");
        coins_map_2.put("weight","30");
        coins_map_2.put("rewardRangeStart","300");
        coins_map_2.put("rewardRangeEnd","500");
        Map<String,Object> coins_map_3 = new HashMap<String,Object>();
        coins_map_3.put("rewardType","COINS");
        coins_map_3.put("rewardWeight","25");
        coins_map_3.put("rewardRangeStart","500");
        coins_map_3.put("rewardRangeEnd","1000");
        List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
        list.add(coins_map_1);
        list.add(coins_map_2);
        list.add(coins_map_3);
        list.add(cashback_map_1);
        list.add(cashback_map_2);
        list.add(cashback_map_3);
        for (int i =0;i<=1000;i++) {
            getWeight(list,ran.nextInt(99)+1);
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
