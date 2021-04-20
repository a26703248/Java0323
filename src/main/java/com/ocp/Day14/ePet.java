package com.ocp.Day14;
public class ePet extends Pet{

    @Override
    public void eat() {
        System.out.println("吃電");
    }

    @Override
    public void move() {
        System.out.println("震動");
    }
    
}
