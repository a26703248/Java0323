package com.ocp.Day09;

public class ArrayDemo {

    public static void main(String[] args) {
        double[][] a = new double[][]{{100, 90, 80}, {70, 60, 50}};
        int sum = 0;
//        System.out.println(a);
//        System.out.println(a[0]);
//        System.out.println(a[1]);
        //求總分
        int c = 1;
        for (double[] ds : a) {
            for (double d : ds) {
                System.out.println("Student " + c + "=" + d);
                c++;
            }
        }
        for (double[] ds : a) {
            for (double d : ds) {
                sum += d;
            }
        }
        System.out.println("總分:" + sum);
    }
}
