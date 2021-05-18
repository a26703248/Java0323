package com.ocp.Day26;

import java.util.*;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<String, Integer> exams=new LinkedHashMap<>();
        exams.put("國文", 100);//("國文", 100)->稱為Entry(含有Key/Value)
        exams.put("數學", 100);
        exams.put("英文", 90);
        //exams.put("英文", 80);//如果後面有輸入同樣Key值時將會覆蓋前一個資料同樣Key的Value
        System.out.println(exams);
        //如果有很多Entry,我們稱為KeySet(每個Entry都不會重複)
        exams.entrySet().forEach(e->System.out.println(e.getKey()));
        
        exams.entrySet().forEach(entry->System.out.println(entry.getValue()));
        
        IntSummaryStatistics stat=exams.entrySet()
                .stream()
                .mapToInt(entry->entry.getValue())
                .summaryStatistics();
        System.out.println("總分: "+stat.getSum());
        System.out.println("平均: "+stat.getAverage());
    }
}
