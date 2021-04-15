package com.ocp.Day13;

import java.util.stream.IntStream;

public class overLoadingDemo2 {
    /*public void calc(int x,int y){
        System.out.println(x+y);
    }
    public void calc(int x,int y,int z){
        System.out.println(x+y);
    }*/
    /*public void calc(int[] x){
        System.out.print(IntStream.of(x).sum());
    }*/
    public void calc(int ...array){
        System.out.println(IntStream.of(array).sum());
    }
    
    public static void main(String[] args) {
        overLoadingDemo2 old2=new overLoadingDemo2();
        old2.calc(10, 20);
        old2.calc(10, 20, 30);
        int[] array={10,20,30,40,50,60,70};
        old2.calc(array);
    }
}
