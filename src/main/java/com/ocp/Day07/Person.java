package com.ocp.Day07;
public class Person {
    double h;
    double w;
    double bmi;
    String name;

    public Person(String name,double h,double w) {
        this.name=name;
        this.h=h;
        this.w=w;
        bmi=w/Math.pow(h/100,2);
    }
}
