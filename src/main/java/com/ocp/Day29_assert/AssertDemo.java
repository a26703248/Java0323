package com.ocp.Day29_assert;

public class AssertDemo {
    public static void main(String[] args) {
        int score=400;
        //1.設定為Main class
        //2.加上 -ea
        //3.找出問題後要把assert拔除
        //assert(score>=0 && score<=100):"分數錯誤"+score;
        if (score>=0 && score<=100) {
            System.out.println(score>=60?"及格":"不及格");
        }else{
            System.out.println("分數錯誤"+score);
        }
        
        
        
        
        
        
        
        
        
        
    }
}
