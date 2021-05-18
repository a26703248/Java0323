package com.ocp.Day26;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        //考試科目國文,英文,數學->set<String>集合
        //考試成績100,  90,100->List<Integer>集合
        Map<String, Integer> exams=new LinkedHashMap<>();
        exams.put("國文", 100);
        exams.put("數學", 100);
        exams.put("英文", 90);
        System.out.println(exams);
        //取得考試科目
        Set<String> subject=exams.keySet();
        System.out.println(exams.keySet());
        //取得單一考試成績
        System.out.println(exams.get("國文"));
        //取得所有考試成績
        Collection<Integer> scores=exams.values();
        System.out.println(scores);
        List<Integer> scores2=new ArrayList<>(scores);
        System.out.println(scores2);
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
