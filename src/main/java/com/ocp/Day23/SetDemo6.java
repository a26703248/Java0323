package com.ocp.Day23;

import java.util.*;

public class SetDemo6 {
    public static void main(String[] args) {
        //利用Hashset加入資料
        Set<Integer> data=new HashSet<>();
        data.add(100);
        data.add(80);
        data.add(90);
        //利用TreeSet查詢資料
        //將HashSet轉TreeSet
        data=new TreeSet<>(data);
        System.out.println(data);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
