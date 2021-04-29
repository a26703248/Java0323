package com.ocp.Day18;

import java.util.function.*;

public class FunctionDemo {
    public static void main(String[] args) {
        //利用Function(帶一個參數)來實作圓面積
        //半徑R是整數，面積是浮點數
        Function<Integer,Double> f1=(r)->Math.pow(r, 2)*Math.PI;
        System.out.println(f1.apply(10));
        //利用Function(帶一個參數)來實作圓體積
        //半徑R是整數，面積是浮點數
        Function<Integer,Double> f2=(r)->4.0/3.0*Math.pow(r, 3);
        System.out.println(f2.apply(10));
        //利用BiFunction(帶兩個參數)來實作矩形積
        //半徑R是整數，面積是浮點數
        BiFunction<Integer,Integer,Integer> f3=(h,w)->h*w;
        System.out.println(f3.apply(10,20));
        //利用BinaryOperator(帶參數型別相同)來實作矩形積
        //半徑R是整數，面積是浮點數
        BinaryOperator<Integer> f4=(h,w)->h*w;
        System.out.println(f4.apply(10,20));
        
        ObjDoubleConsumer<String> f5=(name,value)->System.out.println(name+":"+value);
        f5.accept("小明", 50);
        f5.accept("圓面積", f1.apply(10));
        f5.accept("圓體積", f2.apply(10));
        f5.accept("矩形面積", f3.apply(10,20));
    }
}
