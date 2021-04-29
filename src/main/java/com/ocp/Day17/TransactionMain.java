package com.ocp.Day17;
public class TransactionMain {
    public static void main(String[] args) {
        int amount=10,price=35;
        Transaction t1=(a,b)->System.out.print(a*b);
        t1.print(amount, price);
    }
}
