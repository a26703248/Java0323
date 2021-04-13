package com.ocp.Day12;

import java.util.stream.Stream;

public class Company {
    private static Employee[] employees;
    static{
        Employee e1=new Employee();
        e1.setSalary(3_0000);
        Employee e2=new Employee();
        e2.setSalary(4_0000);
        Employee e3=new Employee();
        e3.setSalary(5_0000);
        //=============================
        Manager m1=new Manager();
        m1.setSalary(7_0000);
        m1.setBudget(10_0000);
        Manager m2=new Manager();
        m2.setSalary(8_0000);
        m2.setBudget(15_0000);
        //=============================
        Director d1=new Director();
        d1.setSalary(20_0000);
        d1.setBudget(50_0000);
        d1.setStockoption(300_0000);
        //=============================
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(d1);
        //=============================
        employees = new Employee[]{e1, e2, e3, m1, m2, d1};
    }
    //取得所有員工資料
    public static Employee[] getemployee(){
        return employees;
    }
    //取得總薪資
    public static int getTotalSalary(){
        return Stream.of(employees).mapToInt(Employee::getSalary).sum();
    }
    //取得平均薪資
    public static double getSalaryOfAvg(){
        return Stream.of(employees).mapToInt(Employee::getSalary).average().getAsDouble();
    }
    //取得總預算
    public static double getTotalBudget(){
        return Stream.of(employees)
                .filter(e->e instanceof Manager)
                .mapToInt(e->((Manager)e).getBudget())
                .sum();
    }
    //取得員工總數
    public static int  amount(){
        return employees.length;
    }
}
