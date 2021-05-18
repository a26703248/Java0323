package com.ocp.Day25;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> v=new Vector<>(1300,5);//初始空間及增長空間可以由建構子給定
        int n=1300;
        for (int i = 1; i <= n; i++) {
            v.add(i);
        }
        v.add(10);
        v.add(20);
        System.out.printf("Capacity(容積空間): %d\n",v.capacity());//以原長度*2方式增長
        System.out.printf("size(已使用): %d\n",v.size());
        System.out.printf("殘餘空間: %d\n",v.capacity()-v.size());
    }
}
