package com.lab;

import java.util.stream.IntStream;

public class Java8Study {
    public static void main(String[] args) {
        int[] scores={80,50,70,90,40};
        //請印出所有成績
        //java 7
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i]+" ");
        }
        System.out.println();
        for (int i : scores) {
            System.out.print(i+" ");
        }
        System.out.println();
        //java 8(***利用Stream.of()來進行資料分析***)
        IntStream.of(scores).forEach(s ->System.out.print(s+" "));
        IntStream.of(scores).forEach(System.out::println);
    }
}
