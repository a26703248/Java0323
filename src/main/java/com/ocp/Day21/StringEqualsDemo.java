package com.ocp.Day21;
public class StringEqualsDemo {
    public static void main(String[] args) {
        String s1="java";
        String s2=new String("java");
        String s3=new String(new char[]{'j','a','v','a'});
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        //物件若要使用==的時機，a與b是不是指向同一個物件
        String a="java";
        String b=a;
        System.out.println(a==b);
        
        
    }
}
