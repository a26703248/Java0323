package com.lab;

import java.util.Random;

public class util {
    //取得int[]答案陣列
    public static int[] getAnswerArray() {
        Random r=new Random();
        int [] ans={0,0,0,0};//new int[4]
        for (int i = 0; i < ans.length;) {
            //隨機去一個n值(1~9)
            int n = r.nextInt(9) + 1;
            boolean exist=isExist(ans, n);
            if(!exist){
                ans[i]=n;
                i++;//重要
            }
        }
        return ans;
    }
    //判斷N值是否在sans[] int陣列中
    private static boolean isExist(int[] ans,int n){
        for (int i = 0; i < ans.length; i++) {
            if (ans[i]==n)
                return true;
        }
        return false;
    }
}
