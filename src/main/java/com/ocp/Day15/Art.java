package com.ocp.Day15;
public class Art extends Employee{

    public Art() {
    }

    public Art(int salary) {
        super(salary);
    }

    @Override
    void job() {
        System.out.println("繪圖");
    }
    
}
