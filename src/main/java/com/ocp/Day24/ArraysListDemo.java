package com.ocp.Day24;

import java.util.*;

public class ArraysListDemo {
    public static void main(String[] args) {
        List<String> list=new ArrayList();
        list.add("A");
        list.add("C");
        list.add(0,"B");//指定位置
        list.add("C");
        System.out.println(list);
        //巡訪器
        ListIterator<String> iter=list.listIterator();
        while (iter.hasNext()) {
            int nextId=iter.nextIndex();
            String next = iter.next();
            System.out.printf("%d : %s\n",nextId,next);
        }
        while (iter.hasPrevious()) {
            int prevId=iter.previousIndex();
            String Previous = iter.previous();
            System.out.printf("%d : %s\n",prevId,Previous);
        }
        
        
        
        
        
        
    }
}
