package com.ocp.Day25;

import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Stream;

public class ProductQueueDemo {
    public static void main(String[] args) {
        Product p1=new Product("口罩", 20);
        Product p2=new Product("酒精", 50);
        Product p3=new Product("手套", 15);
        
        
        Queue<Product> product=new LinkedList<>();
        product.offer(p1);
        product.offer(p1);
        product.offer(p2);
        product.offer(p2);
        product.offer(p2);
        product.offer(p3);
        System.out.println("購物車: "+product);
        //結帳
        int amount=0;
        while(!product.isEmpty()){
            amount+=product.poll().getPrice();
        }
        //應付帳款
        System.out.println("應付帳款: "+amount);
        //查看購物車
        System.out.println("購物車: "+product);
    }
}
