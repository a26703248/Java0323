package com.ocp.Day06;

import java.util.Arrays;

public class ArraysDemo02 {

    public static void main(String[] args) {
        int[] scores = {100, 90, 90, 80, 70, 50, 40, 100, 75, 15};
        int sum=0;
        System.out.printf("%s, 長度:%d\n",Arrays.toString(scores),scores.length);
        for (int x:scores) {
            sum+=x;
        }
        double avg=(double)sum/scores.length;
        System.out.printf("總分:%d 平均:%.1f",sum,avg);
        
    }
}
