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
        
        Arrays.stream(DataCenter.getPeopl())
                .filter(i -> i instanceof Student)
                .map(x->((Student)x))
                .filter(x -> x.getScore()<60)
                .peek(x->System.out.printf("學生:%s,分數:%d,老師:%s",
                        x.getName(),x.getScore(),x.getTeacher().getName()))
                .mapToInt(x-> x.getScore())
                .average()
                .getAsDouble();
    }
}
