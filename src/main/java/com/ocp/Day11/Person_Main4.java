package com.ocp.Day11;

import java.util.DoubleSummaryStatistics;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class Person_Main4 {
    public static void main(String[] args) {
        Person[][] person={
            {
                new Person("Amy",17, 170,60.5),
            new Person("Mary",18, 160,50.5)
            },
            {
                new Person("John",19, 155,42.5),
            new Person("Helen",20, 185,75.5),
            new Person("Tom",21, 190,120.5),
        },};
        //計算BMI的平均,最大與最小值多少?
        
        Function<Person,Double> getBMI=p->Math.round(p.getWeight()/Math.pow(p.getHight()/100, 2)*100)/100.0;
        
        Stream.of(person)
                .flatMap(Stream::of)
                .mapToDouble(getBMI::apply)
                .forEach(System.out::println);
        //誰的BMI值最小
        DoubleSummaryStatistics stat = Stream.of(person)
                .flatMap(Stream::of)
                .mapToDouble(getBMI::apply)
                .summaryStatistics();
        System.out.printf("BMI值最大:%.2f, 最小%.2f\n",stat.getMax(),stat.getMin());
        
        Consumer<Person> printName=p->{
            System.out.printf("%s=%d %.2f %.2f bmi=%.2f\n",
                    p.getName(),p.getAge(),p.getHight(),p.getWeight(),getBMI.apply(p));
        };
        
        Stream.of(person)
                .flatMap(Stream::of)
                .filter(p->getBMI.apply(p)==stat.getMax())
                .forEach(printName);
    }
}
