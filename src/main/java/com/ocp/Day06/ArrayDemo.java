package com.ocp.Day06;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int [] scores=new int[3];
        scores[0]=100;
        scores[1]=90;
        scores[2]=90;
        int len=scores.length;
        System.out.printf("陣列長度:%d\n",len);
        System.out.println("["+scores[0]+","+scores[1]+","+scores[2]+"]");
        System.out.println("陣列長度:"+Arrays.toString(scores));
        int sum=scores[0]+scores[1]+scores[2];
        double avg=(double)sum/len;
        System.out.printf("總分:%d 平均:%.1f\n",sum,avg);
    }
}
