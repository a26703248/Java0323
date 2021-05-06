package com.ocp.Day23;
import java.util.*;
public class SetDemo7 {
    public static void main(String[] args) {
        //子集合
        TreeSet<Integer> data1=new TreeSet<>();
        data1.add(2);
        data1.add(4);
        data1.add(5);
        data1.add(8);
        SortedSet<Integer> data2=new TreeSet<>();
        data1.add(2);
        data1.add(4);
        data1.add(5);
        data1.add(8);
        System.out.println(data1);
        SortedSet<Integer> sub1=data1.subSet(2, false, 8, false);//尋找期間的數若要包含該數true不包含該數false
        SortedSet<Integer> sub2=data2.subSet(2, 8);//尋找期間的數若要包含起始值,但不包含結束值
        System.out.println(sub1);
        System.out.println(sub2);
        
        
        
        
        
    }
}
