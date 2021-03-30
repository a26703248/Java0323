package com.ocp.Day08;

public class StringDemo {
    public static void main(String[] args) {
        String s1="jbvb";
        String s2="java";
        s1=s1.replace('b', 'a');//取代所有指定字串
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);//
        System.out.println(s1.equals(s2));
        
    }
}
