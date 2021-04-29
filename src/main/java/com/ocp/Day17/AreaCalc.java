package com.ocp.Day17;
public class AreaCalc {
    public static void main(String[] args) {
        double r=15.0;
        CircleArea ca=new CircleAreaTmpl();
        CircleArea ca1=new CircleArea(){
            @Override
            public double getArea(double r) {
                return (4/3)*Math.pow(r, 3)*Math.PI;
            }
        };
        
        System.out.println(ca1.getArea(r));
    }
}