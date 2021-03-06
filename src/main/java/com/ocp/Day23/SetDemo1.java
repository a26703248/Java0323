package com.ocp.Day23;

import java.util.*;

public class SetDemo1 {
    public static void main(String[] args) {
        Set subjects=new LinkedHashSet();
        subjects.add("國");//String
        subjects.add("英");//String
        subjects.add(null);//null
        subjects.add("數");//String
        subjects.add(100);//Integer
        System.out.println(subjects);
        //走訪每一個元素
        Iterator iter=subjects.iterator();
        while (iter.hasNext()) {
            Object next=iter.next();
            //System.out.println(iter.next());
            if(next==null){
                iter.remove();
                continue;
            }
            if(next instanceof Integer){
                iter.remove();
            }
            
        }
        System.out.println(subjects);
    }
}
/*
動態陣列(Collection),可任意增減元素
Set單向,不可重複
List單向,可重複
Map單向,不可重複(EntrySet)
*/