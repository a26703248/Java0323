package com.ocp.Day21;

public class Monkey {
    public static void main(String[] args) {
        work(Week.MON);
        //work(100); //下錯參數
        
    }
    public static void work(Week week){
        switch(week){
            case MON:
                System.out.println("猴子穿新衣");
                break;
            case TUES:
                System.out.println("猴子去烤肉");
                break;
        }
    }
}
