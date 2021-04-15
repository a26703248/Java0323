package com.ocp.Day13;
public class overLoadingDemo {
    public void calc(int x){
        System.out.println("int : "+x);
    }
    public void calc(Integer x){
        System.out.println("Integer : "+x);
    }
    public void calc(float x){
        System.out.println("float : "+x);
    }
    public void calc(double x){
        System.out.println("double : "+x);
    }
    public void calc(int ...x){
        System.out.println("int ...x : "+x);
    }
    public static void main(String[] args) {
        overLoadingDemo old=new overLoadingDemo();
        old.calc(100.0);
    }
}
