package com.ocp.Day11;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class Person_main {
    public static void main(String[] args) {
        Person[] person={
            new Person("Amy",17, 170,60.5),
            new Person("Mary",18, 160,50.5),
            new Person("John",19, 155,42.5),
            new Person("Helen",20, 185,75.5),
            new Person("Tom",21, 190,120.5),
        };
        //請印出未成年的人名
        Stream.of(person)
                .filter(p->p.getAge() <18)
                .forEach(System.out::println);
        //請印出BMI過高的人
        Stream.of(person)
                .filter(p->(p.getWeight()/Math.pow(p.getHight(), 2)) >18)
                .filter(p->(p.getWeight()/Math.pow(p.getHight(), 2)) <23)
                .forEach(p->System.out.println());
        Stream.of(person)
                .filter(p -> {
                    double bmi = p.getWeight()/Math.pow(p.getHight()/100, 2);
                    return bmi<18?false:bmi>23?false:true;
                })
                .forEach(p -> System.out.println(p.getName()));
        Predicate<Person> noemalBmi=p->{
                    double bmi = p.getWeight()/Math.pow(p.getHight(),2);
                    return bmi<18?false:bmi>23?false:true;
                };
        Predicate<Person> thinBmi=p->{
                    double bmi = p.getWeight()/Math.pow(p.getHight(),2);
                    return bmi<18?false:bmi>23?false:true;
                };
        Predicate<Person> fatBmi=p->{
                    double bmi = p.getWeight()/Math.pow(p.getHight(),2);
                    return bmi<18?false:bmi>23?false:true;
                };
        Stream.of(person)
                .filter(noemalBmi)
                .forEach(p -> System.out.println(p.getName()));
    }
}
