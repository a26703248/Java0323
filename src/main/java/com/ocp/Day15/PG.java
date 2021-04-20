package com.ocp.Day15;
public class PG extends Employee{

    public PG() {
        
    }
    public PG(int salary){
        super(salary);
    }
    @Override
    void job() {
        System.out.println("寫程式");
    }
    
}
