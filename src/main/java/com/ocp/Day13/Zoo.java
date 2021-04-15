package com.ocp.Day13;
public class Zoo {
    public static void main(String[] args) {
        Cat cat =new Cat();
        cat.shout();
        //cat.hunter();//cat無此方法
        Tiger tiger =new Tiger();
        tiger.shout();
        tiger.hunter();
        Cat cat2=new Tiger();
        //cat2.hunter();//方法呼叫看左邊
        
    }
}
