package com.ocp.Day16;
public class Fighter extends Airplane implements Weapon,Oil{

    @Override
    public int spmd() {
        return 10_000;
    }

    @Override
    public int speed() {
        return 2000;
    }

    @Override
    public void shoot() {
        System.out.println("響尾蛇飛彈");
    }
}
