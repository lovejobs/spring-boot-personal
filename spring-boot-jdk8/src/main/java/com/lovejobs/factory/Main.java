package com.lovejobs.factory;

import java.util.HashMap;

public class Main {

    private static final HashMap<String,InterfaceTest> map = new HashMap<>();


    static {
        map.put("A",new InterfaceTestAImpl());
        map.put("B",new InterfaceTestBImpl());
        map.put("C",new InterfaceTestCImpl());
    }

    public static void main(String[] args) {
        String name = "C";
        String result = map.get(name).getResult("fengxin");
        System.out.println(result);
    }
}
