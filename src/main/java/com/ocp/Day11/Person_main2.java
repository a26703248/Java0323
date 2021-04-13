package com.ocp.Day11;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Person_main2 {
    public static void main(String[] args) {
        Person[] persons={
            new Person("Amy",17, 170,60.5),
            new Person("Mary",18, 160,50.5),
            new Person("John",19, 155,42.5),
            new Person("Helen",20, 185,75.5),
            new Person("Tom",21, 190,120.5),
        };
        // 建立 BMI 的資料計算邏輯, 使用 Function<T, R>
        // 參考 API: https://docs.oracle.com/javase/8/docs/api/java/util/function/Function.html
        // T 代表 傳入參數型別, 在這邊指的就是 Person 物件也就是 p
        // R 代表 回傳資料型別, 在這邊指的就是 Double 也就是 bmi 的計算結果
        Function<Person,Double> getBMI=p->p.getWeight()/Math.pow(p.getHight()/100, 2);
        //正常BMI的過濾器Predicate<Person>
        Predicate<Person> normalBmi = p -> getBMI.apply(p) > 18 && getBMI.apply(p) <= 23;//判斷用
        //印出人名
        Consumer<Person> printName=p->System.out.println(p.getName());
        //印出正常BMI的人
        Stream.of(persons).filter(normalBmi).forEach(printName);
        
    }
}
