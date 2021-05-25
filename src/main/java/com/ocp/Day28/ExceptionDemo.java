package com.ocp.Day28;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.print("請輸入半徑: ");
        Scanner scanner=new Scanner(System.in);
        try{
            double r=scanner.nextDouble();
            double area=Math.pow(r, 2)*Math.PI;
            System.out.printf("Area: %.2f\n",area);
        }catch(Throwable e){
            System.out.println("錯誤內容: "+e);
        }
    }
}
