package com.ocp.Day28;

/*
Checked Exception: 受檢例外
Unchecked Exception: 非受檢例外(Error, RuntimeException)
*/
public class CheckAndUncheckException {
    public static void main(String[] args) {
        /*
        Unchecked Exception: 非受檢例外
        一遇到不是立即停止程式就是程式碼不夠堅固
        立即停止: Error
        程式碼不夠堅固: RuntimeException(可以重程式改進,不一定要try...catch)
        */
        int x=10;
        int y=0;
        if(y != 0){ //避免ArithmeticException的發生
            int avg=x/y;
        }
        int[] nums={};
        if(nums != null){//避免NullPointerException的發生
            if(nums.length>0){//避免ArrayIndexOutOfBoundsException的發生
                System.out.println(nums[0]);
            }
        }
        
        
        
        
        
        
        
        
        
        
    }
}
