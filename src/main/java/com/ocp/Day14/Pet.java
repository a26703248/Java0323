package com.ocp.Day14;
public abstract class Pet implements Animal{

    @Override
    public void eat() {
        System.out.println("吃飼料");
    }
    
}
