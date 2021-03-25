package com.ocp.Day07;

//某公司有18位員工，
//其中10位在去年投資股票，一年的獲利率如下(單位：%)：
//7.6 3.9 15.6 28.3 1.2 10.8 35.3 45.6 10.2 0.5
//另外8位員工投資買公債一年內獲利率如下(單位：%)
//6.8 7.2 6.8 7.5 6.9 7.9 7.9 7.1 7.2
//試分別求此公司的員工投資股票與公債的獲利率變異係數
//以及哪一種投資的獲利較穩健 ? 
public class ArrayDemo03 {
    public static void main(String[] args) {
        double[]stocks={7.6,3.9,15.6,28.3,1.2,10.8,35.3,45.6,10.2,0.5};
        double[]bounds={6.8,7.2,6.8,7.5,6.9,7.9,7.9,7.1,7.2};
        System.out.printf("股票利率變異數:%.1f%% 公債利率變異數:%.1f%%\n",MyMath.cv(stocks)*100,MyMath.cv(bounds)*100);
        System.out.printf("股票最大獲利:%.1f%%最小獲利:%.1f%%\n",MyMath.Max(stocks),MyMath.Min(stocks));
        System.out.printf("公債最大獲利:%.1f%%最小獲利:%.1f%%\n",MyMath.Max(bounds),MyMath.Min(bounds));
        System.out.println(MyMath.MethodA(stocks, bounds));
        System.out.println(MyMath.MethodB(stocks, bounds));
    }
}
