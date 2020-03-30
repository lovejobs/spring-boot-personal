package com.lovejobs.jdk8.stream;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class JDK8Stream {

    private static void createStream(){
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        List<String> result = strings.stream().filter(string -> !StringUtils.isEmpty(string)).collect(Collectors.toList());
        System.out.println(JSONObject.toJSONString(result));
    }

    private static void createParallelStream(){
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        List<String> result = strings.parallelStream().filter(string -> !StringUtils.isEmpty(string)).collect(Collectors.toList());
        System.out.println(JSONObject.toJSONString(result));
    }

    private static void foreach(){
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        strings.forEach(System.out::println);
    }

    private static void map(){
        List<Integer> integers = Arrays.asList(2,3,4,1,2,7,11,234);
        List<Integer> results = integers.stream().map(i -> i*i).collect(Collectors.toList());
        results.forEach(System.out::println);
    }

    private static void collectors(){
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        List<String> tmp = strings.stream().filter(string -> !StringUtils.isEmpty(string)).collect(Collectors.toList());
        String resultStr = tmp.stream().collect(Collectors.joining(","));
        System.out.println(resultStr);
    }

    private static void Sum(){
        List<Integer> integers = Arrays.asList(2,3,4,1,2,7,11,234);
        IntSummaryStatistics summaryStatistics = integers.stream().mapToInt(x->x).summaryStatistics();
        System.out.println("列表中最大的数 : " + summaryStatistics.getMax());
        System.out.println("列表中最小的数 : " + summaryStatistics.getMin());
        System.out.println("所有数之和 : " + summaryStatistics.getSum());
        System.out.println("平均数 : " + summaryStatistics.getAverage());
    }

    public static void main(String[] args) {
        // createStream();
        //foreach();
        //map();
        //collectors();
        Sum();
    }
}
