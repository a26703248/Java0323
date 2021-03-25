package com.ocp.Day04;

import com.ocp.Day04.bar.Money;
public class AccessMoney {
    public static void main(String[] args) {
        Money m1=new Money();
        com.ocp.Day04.foo.Money m2=new com.ocp.Day04.foo.Money();
        System.out.println(m1.money+m2.money);
        
    }
}
