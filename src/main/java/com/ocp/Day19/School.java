package com.ocp.Day19;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

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
        
        Consumer<Student> c1=s ->System.out.printf("學生:%s,分數:%d,老師:%s",s.getName(),
                s.getScore(),s.getTeacher().getName());
        Predicate<Student> p1=x-> x.getScore()<60;
        double avg=Arrays.stream(DataCenter.getPeopl())
                .filter(i -> i instanceof Student)
                .map(x->((Student)x))
                .filter(p1)
                .peek(c1)
                .mapToInt(Student::getScore)
                .average()
                .getAsDouble();
        System.out.println("不及格分數:"+avg);
    }
}
