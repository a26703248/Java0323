package com.ocp.Day22;
public class LottoDemo {
    public static void main(String[] args) {
        Lotto a=Lotto.getLotto();
        System.out.println("小名回報今日四星彩: "+a.getValues());
        Lotto b=Lotto.getLotto();
        System.out.println("小華回報今日四星彩: "+b.getValues());
        Lotto c=Lotto.getLotto();
        System.out.println("小英回報今日四星彩: "+c.getValues());
    }
}