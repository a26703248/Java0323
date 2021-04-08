package com.ocp.Day11;
public class Person {
    //物件屬性
    private String name;

    private int age;
    private double hight,weight;
    //建構子
    public Person(String name, int age, double hight, double weight) {
        this.name = name;
        this.age = age;
        this.hight = hight;
        this.weight = weight;
    }
    //物件方法(封裝方法)
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public double getHight() {
        return hight;
    }
    public void setHight(double hight) {
        this.hight = hight;
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
}
