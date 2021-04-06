package com.lab;

import java.util.stream.IntStream;

public class Java8Study2 {
    public static void main(String[] args) {
        int[] scores={80,50,70,90,40};
        //java 7前寫法
        for (int i = 0; i < scores.length; i++) {
            if(scores[i]>=60)
                System.out.print(scores[i]+" ");
        }
        System.out.println();
        for (int score : scores) {//foreach
            if(score>=60)//filter過濾
                System.out.print(score+" ");
        }
        System.out.println();
        //java 8後寫法
        IntStream.of(scores).filter(s -> s>=60).forEach(s ->System.out.print(s+" "));
        System.out.println();
    }
}
