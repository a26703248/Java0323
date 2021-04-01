package com.ocp.Day09;

public class Array2 {

    public static void main(String[] args) {
        double[][] hw = {{170, 60}, {160, 45}, {180, 90}};
        
        for (double[] ds : hw) {
            double h=ds[0];
            double w=ds[1];
            double bmi=w/Math.pow(h/100, 2);
            System.out.printf("%.2f\n",bmi);
        }
    }
}
