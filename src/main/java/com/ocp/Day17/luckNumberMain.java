package com.ocp.Day17;

import java.util.Random;

public class luckNumberMain {
    public static void main(String[] args) {
        //利用Lambda實作一個可以1-9的數字
        luckNumber luck=()->new Random().nextInt(9)+1;
        System.out.println(luck.get());
        //利用Lambda實作一個可以1-49的數字
        luckNumber luck2=()->{
            Random r=new Random();
            return r.nextInt(49)+1;
        };
        System.out.println(luck2.get());
    }

}
