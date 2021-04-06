package com.ocp.Day10;
public class WarpperDemo {
    public static void main(String[] args) {
        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;
        int Byte=Integer.BYTES;
        System.out.println("int的最大值:"+max);
        System.out.println("int的最小值:"+min);
        System.out.println("int的空間:"+Byte);
        int max2=Integer.max(10,20);
        System.out.printf("10跟20最大值:%d\n",max2);
        String chinese="100";
        String english="90";
        int sum=Integer.sum(Integer.parseInt(chinese),Integer.parseInt(english));
        System.out.printf("兩科分數:%d\n",sum);
    }
}
