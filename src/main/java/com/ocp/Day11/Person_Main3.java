package com.ocp.Day11;

import java.util.DoubleSummaryStatistics;
import java.util.function.Function;
import java.util.stream.Stream;

public class Person_Main3 {
    public static void main(String[] args) {
        Person[] person={
            new Person("Amy",17, 170,60.5),
            new Person("Mary",18, 160,50.5),
            new Person("John",19, 155,42.5),
            new Person("Helen",20, 185,75.5),
            new Person("Tom",21, 190,120.5),
        };
        //計算BMI的平均,最大與最小值多少?
        
        Function<Person,Double> getBMI=p->p.getWeight()/Math.pow(p.getHight()/100, 2);
        
        DoubleSummaryStatistics bmi = Stream.of(person)
                .mapToDouble(getBMI::apply)
                .summaryStatistics();
        System.out.printf("平均:%.2f, 最大:%.2f, 最小:%.2f\n",
                bmi.getAverage(),
                bmi.getMax(),
                bmi.getMin());
    }
}
