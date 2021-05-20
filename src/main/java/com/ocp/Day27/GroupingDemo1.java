package com.ocp.Day27;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingDemo1 {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.add("Apple");
        names.add("Banana");
        names.add("Apple");
        names.add("Apple");
        names.add("Orange");
        names.add("Papaya");
        names.add("Banana");
        names.add("WaterMelon");
        System.out.println(names);
        //每一種水果出現的次數
        Map<String, Long> result=names.stream()
                .collect(Collectors.groupingBy(Function.identity()
                        ,Collectors.counting()));
        System.out.println(result);
        //value 大->小 列出
        result.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .forEach(System.out::println);
        //value 大->小 列出並存放在finalMap裡
        Map<String, Long> finalMap=new LinkedHashMap<>();
        result.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .forEachOrdered(entry->finalMap.put(entry.getKey(),entry.getValue()));
        System.out.println("finalMap: "+finalMap);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
