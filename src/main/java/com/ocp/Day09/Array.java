package com.ocp.Day09;
public class Array {
    public static void main(String[]args){
        int[][] a=new int[2][3];
        a[0][0]=100;
        a[0][1]=90;
        a[0][2]=80;
        a[1][0]=70;
        a[1][1]=60;
        a[1][2]=50;
        for(int i=0;i<2;i++){
            for(int k=0;k<3;k++){
                System.out.println(a[i][k]);
            }
        }
        //改良
        for(int i=0;i<a.length;i++){
            for(int k=0;k<a[i].length;k++){
                System.out.println(a[i][k]);
            }
        }
        //加強型
        for (int[] is : a) {
            for (int i : is) {
                System.out.println(i);
            }
        }
    }
}