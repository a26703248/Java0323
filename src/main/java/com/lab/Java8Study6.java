package com.lab;

import java.util.IntSummaryStatistics;
import java.util.stream.Stream;

public class Java8Study6 {
    public static void main(String[] args) {
        String[] names={"banana","watermelen","apple","orange","mango"};
        //請求所有字母總和
        IntSummaryStatistics stat=Stream.of(names)
                .mapToInt(String::length)
                .filter(s->(s%2)==0)
                .summaryStatistics();
        System.out.printf("所有水果字母總和:%d\n",stat.getSum());
    }
}
