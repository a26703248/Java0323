package com.ocp.Day06;

import java.util.Arrays;

public class ArraysDemo02 {

    public static void main(String[] args) {
        int[] scores = {50, 90, 90, 80, 70, 100, 40, 100, 75, 15};
        int sum = 0;
        int max = 0;
        System.out.printf("%s, 長度:%d\n", Arrays.toString(scores), scores.length);
        for (int x : scores) {
            sum += x;
        }
        double avg = (double) sum / scores.length;
        System.out.printf("總分:%d 平均:%.1f\n", sum, avg);
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
        }
        System.out.println("最高分:"+max);
        int min=max;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] <max) {
                min = scores[i];
            }
        }
        System.out.println("最低分:"+min);
    }
}
