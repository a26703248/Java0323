package com.lab;

import java.util.stream.IntStream;

public class Java8Study3 {
    public static void main(String[] args) {
        int[] scores={80,50,70,90,40};
        int sum=0;
        //java 7前寫法
        for (int score : scores) {
            sum+=score;
        }
        double avg=(double)sum/scores.length;
        System.out.println(sum);
        System.out.println(avg);
        //java 8前寫法
        int sum2=IntStream.of(scores).sum();
        double avg2=IntStream.of(scores).average().getAsDouble();
//        double avg2=sum2/scores.length;
        System.out.println(sum2);
        System.out.println(avg2);
    }
}
