package com.ocp.Day23;

import java.util.*;

public class SetDemo4 {
    public static void main(String[] args) {
        //國英數總分0~100之間
        Set<Integer> scores=new LinkedHashSet<>();
        int sum=0;
        scores.add(100);
        scores.add(200);
        scores.add(90);
        scores.add(-150);
        scores.add(80);
        //請用 Java1.8計算總分
        IntSummaryStatistics s=scores.stream()
                .filter(score::isValid)
                .mapToInt(Integer::intValue)
                .summaryStatistics();
        System.out.println(s.getSum());
        System.out.println(s.getMax());
        System.out.println(s.getMin());
        System.out.println(s.getAverage());
        
        
        
        
        
    }
}
