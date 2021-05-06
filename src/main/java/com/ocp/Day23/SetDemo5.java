package com.ocp.Day23;
import java.util.*;
public class SetDemo5 {
    public static void main(String[] args) {
        //排序性(小->大)
        Set<Integer> nums=new TreeSet<>();
        //1~9任意5個
        Random r=new Random();
        while (nums.size()<7) {            
            int n=r.nextInt(9)+1;
            nums.add(n);
            System.out.println("n:"+n);
        }
        System.out.println(nums);
    }
}
