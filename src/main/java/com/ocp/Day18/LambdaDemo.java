package com.ocp.Day18;

import java.util.stream.*;

public class LambdaDemo {
    public static void main(String[] args) {
        int[] scores={};
        Stream.of(100, 50, 70, 80, 30)
                //.peek(x->System.out.println(x.getClass().getName());)
                .forEach(System.out::println);//Consumer
        Stream.of(100, 50, 70, 80, 30)
                .filter(x->x>=60)//Predicate
                .forEach(System.out::println);//Consumer
        Stream.of("Mary", "John", "Bob", "Helen")
                //.mapToInt(s->s.length())//Predicate
                .mapToInt(String::length)
                .forEach(System.out::println);//Consumer
        
        
        
        
        
    }
}
