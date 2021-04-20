package com.ocp.Day16;
public class Tank extends Car implements Weapon,Oil{

    @Override
    public int spmd() {
        return 300;
    }

    @Override
    public void move() {
        System.out.println("履帶");
    }

    @Override
    public void shoot() {
        System.out.println("穿甲彈");
    }
    
}
