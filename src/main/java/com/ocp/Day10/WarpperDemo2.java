package com.ocp.Day10;
public class WarpperDemo2 {
    public static void main(String[]args){
        //auto boxing/unboxing自動拆裝箱
        //java 5.0版本前的寫法
        Integer a=new Integer(100);
        Integer b=new Integer(200);
        System.out.println(a.intValue()+b.intValue());
        //java 5.0版本後的寫法(compile suger)
        Integer a2=100;//相當於java編譯器幫你產生new Integer(100) auto-boxing
        Integer b2=200;
        System.out.println(a2+b2);//相當於java編譯器幫你調用intValue()方法 auto-Unboxing
        int c=new Integer(100);
    }
}
