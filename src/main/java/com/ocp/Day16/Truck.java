package com.ocp.Day16;
public class Truck extends Car implements Oil{

    @Override
    public int spmd() {
        return 100;
    }
    @Override
    void move() {
        System.out.println("輪子");
    }
}
