package com.ocp.Day26;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapGroupByDemo2 {
    public static void main(String[] args) {
        //1~9隨機取100次, 每一個號碼各會取幾次
        Random n=new Random();
        List<Integer> rotto=new ArrayList<>();
        
        for (int i = 0; i <= 100; i++) {
            rotto.add(n.nextInt(9)+1);
        }
        Map<Integer, Long> result=rotto.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(result);
    }
}
