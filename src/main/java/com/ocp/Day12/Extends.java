package com.ocp.Day12;

import java.util.IntSummaryStatistics;
import java.util.stream.Stream;

public class Extends {
    public static void main(String[] args) {
        //操作Employee、Manager、Director
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
        //請問總薪資多少
        System.out.println("請問總薪資多少?");
        Employee[] employees={e1, e2, e3, m1, m2, d1};
        //java 7
//        int sum=0;
//        for (int i = 0; i < employees.length; i++) {
//            System.out.println(employees[i]);
//            sum+=employees[i].getSalary();
//        }
//        System.out.printf("總薪資: %,d\n",sum);
        //java 7(forEach)
//        for (Employee e: employees) {
//            System.out.println(e);
//            sum+=e.getSalary();
//        }
//        System.out.printf("總薪資: %,d\n",sum);
        //java 8
        int sum=Stream.of(employees)
                .mapToInt(Employee::getSalary)
                .sum();
        System.out.printf("總薪資: %,d\n",sum);
        //java 7
//        int managersum=0;
//        int directorsum=0;
//        for (Employee e : employees) {
//            if(e.getClass().getSimpleName().equals("Manager")){
//                managersum+=e.getSalary();
//            }
//            if(e.getClass().getSimpleName().equals("Director")){
//                directorsum+=e.getSalary();
//            }
//        }
//        System.out.printf("Manager的總薪資: %,d\n",managersum);
//        System.out.printf("director的總薪資: %,d\n",directorsum);
        
        //java 8
//        int manargerSum=Stream.of(employees)
//                .filter(e->e.getClass()
//                        .getSimpleName()
//                        .equals("Manager")
//                        ||e.getClass()
//                        .getSimpleName()
//                        .equals("Director"))
//                .mapToInt(Employee::getSalary)
//                .sum();
//        System.out.printf("Manager的總薪資: %,d\n",manargerSum);
        //java 7
        for (Employee e : employees) {
            System.out.println(e instanceof Manager);
        }
        //java 8
        int manargerSum=Stream.of(employees)
                .filter(e->e instanceof Manager)
                .mapToInt(Employee::getSalary)
                .peek(System.out::println)
                .sum();
        System.out.printf("Manager的總薪資: %,d\n",manargerSum);
    }
}
