package com.ocp.Day17;
public class AreaCalc3 {
    public static void main(String[] args) {
        Triangle t1=(a,b)->(a*b)/2;
        System.out.println(t1.getArea(10, 5));
    }
}
