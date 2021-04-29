package com.ocp.Day19;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class School {
    public static void main(String[] args) {
        Arrays.stream(DataCenter.getPeopl())
                .forEach(System.out::println);
        //請問考試的總分平均
        IntSummaryStatistics is=Arrays.stream(DataCenter.getPeopl())
                .filter(i -> i instanceof Student)
                .mapToInt(x->((Student)x).getScore())
                .summaryStatistics();
        System.out.println(is.getSum());
        System.out.println(is.getAverage());
        
        IntSummaryStatistics is1=Arrays.stream(DataCenter.getPeopl())
                .filter(i -> i instanceof Teacher)
                .mapToInt(x->((Teacher)x).getSalary())
                .summaryStatistics();
        System.out.println(is1.getSum());
        System.out.println(is1.getAverage());
    }
}
