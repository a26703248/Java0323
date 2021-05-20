package com.ocp.Day27;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingFruit {
    public static void main(String[] args) {
        List<Fruit> fruits=Arrays.asList(
                 new Fruit("蘋果", 10, 9.99),
                 new Fruit("香蕉", 20, 19.99),
                 new Fruit("柳丁", 10, 29.99),
                 new Fruit("西瓜", 10, 29.99),
                 new Fruit("木瓜", 20, 9.99),
                 new Fruit("蘋果", 10, 9.99),
                 new Fruit("香蕉", 10, 19.99),
                 new Fruit("蘋果", 20, 9.99)
        );
        System.out.println(fruits);
        //分組
        //蘋果=3, 香蕉=2, 柳丁=1, 西瓜=1, 木瓜=1
        Map<String, Long> result=fruits.stream()
                .collect(Collectors.groupingBy(f->f.getName()
                        ,Collectors.counting()));
        System.out.println(result);
        //排序
        result.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .forEach(System.out::println);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
