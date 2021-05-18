package com.ocp.Day26;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
//單一分組
public class MapGroupByDemo {
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
        //Apple:3, Banana:2, Orange:1, Papaya:1, WaterMelon:1
        //分組
        System.out.println(
            names.stream()
                .collect(Collectors.groupingBy(name->name, Collectors.counting()))
        );
        //Function方法撰寫(統計目標值, 處理方法)
        System.out.println(
            names.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
        );
        //Apple:3, Banana:2, Orange:1, Papaya:1, WaterMelon:1Map<String,Long>
        Map<String,Long> result=names.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(result);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
