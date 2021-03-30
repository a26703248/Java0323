package com.ocp.Day08;
public class StringEquals2 {
    public static void main(String[] args) {
        String s1=new String("java");
        String s2="java";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        s1=s1.intern();//s1放入String pool
        System.out.println(s1==s2);
        String s3="Java";
        System.out.println(s2.equalsIgnoreCase(s3));//不分大寫比較
        
    }
}
