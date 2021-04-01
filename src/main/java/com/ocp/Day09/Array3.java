package com.ocp.Day09;

public class Array3 {

    public static void main(String[] args) {
        double[][] hw = {{170, 160, 180}, {60, 45, 90}};
        
        for (int j = 0; j < hw[1].length; j++) {
            double w = hw[1][j];
            double h = hw[0][j];
            double bmi=w/Math.pow(h/100, 2);
            System.out.printf("bmi:%.2f\n",bmi);
        }
    }
}
