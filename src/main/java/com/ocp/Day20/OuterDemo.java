package com.ocp.Day20;
public class OuterDemo {
    public static void main(String[] args) {
        Outer.Inner in=new Outer().new Inner();
        in.print();
        
        Outer.Sinner sin=new Outer.Sinner();
        sin.print();
        
    }
}
