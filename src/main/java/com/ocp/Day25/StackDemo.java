package com.ocp.Day25;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        //將書本放入箱子
        Stack<Product> box=new Stack<>();//先進後出(後進先出)
        box.push(new Product("書本-java", 100));
        box.push(new Product("書本-Python", 90));
        box.push(new Product("書本-C#", 60));
        System.out.println("箱子裡的書: "+box);
        //將書本取出
        while(!box.isEmpty()){
            Product product=box.pop();
            System.out.println("書名: "+product.getName());
        }
        System.out.println("箱子裡的書: "+box);
        
        
        
        
        
        
        
        
        
        
    }
}
