package com.ocp.Day23;

import java.util.*;

public class SetDemo2 {
    public static void main(String[] args) {
        //國文英文數學分數是介於0~100之間
        Set scores=new LinkedHashSet();
        int sum=0;
        scores.add(100);
        scores.add(2000);
        scores.add(90);
        scores.add(80);
        scores.add(3.14);
        scores.add(true);
        System.out.println(scores);
        Iterator itea=scores.iterator();
        while (itea.hasNext()) {
            Object next = itea.next();
            //正面表類
            if(next instanceof Integer){
                if((Integer)next>=0&&(Integer)next<=100){
                    continue;
                }else{
                    itea.remove();
                }
            }else{
                itea.remove();
            }
        }
        itea=scores.iterator();
        while (itea.hasNext()) {
            Object next = itea.next();
            if(next instanceof Integer){
                sum+=(int)next;
            }
        }
        System.out.println(sum);
    }
}
