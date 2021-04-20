package com.ocp.Day15;
public abstract class Employee {

    private int salary;
    public Employee(){}

    public Employee(int salary) {
        this.salary = salary;
    }
    
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    abstract void job();
}
