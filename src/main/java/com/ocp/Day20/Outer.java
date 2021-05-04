package com.ocp.Day20;



//外部類別
public class Outer {
    int x=100;
    static int y=100;
    
    //內部類別
    class Inner{
        void print(){
            System.out.println(Outer.this.x);
            System.out.println(Outer.y);
            System.out.println(Sinner.z);
        }
    }
    //靜態內部類別
   static class Sinner{
       static int z=1000;
       static void print(){
           //System.out.println(Outer.this.x);無法物件類別
           System.out.println(Sinner.z);
           System.out.println(Outer.y);
       }
   }
    
    
    
}
/*
1.一般(不可有static成員)
2.方法(access final成員自動加)
3匿名內
4.靜態內(static不可使用this/super)
*/

