package com.ocp.Day17;
public class AreaCalc2 {
    public static void main(String[] args) {
        double c=15;
        //利用匿名類別實作
        CircleArea ca1=new CircleArea() {
            @Override
            public double getArea(double r) {
                return Math.pow(r, 2)*Math.PI;
            }
        };
        //Lambda語法來實作
        CircleArea ca2=r->4.0/3*Math.pow(r, 3)*Math.PI;
        System.out.println(ca2.getArea(c));
    }
}
