package com.ocp.Day28;
public class ExceptionDemo4 {
    public static void main(String[] args) {
        int[] nums=null;//{10, 0} {10} null
        
        try {
            int avg=nums[0]/nums[1];
            //ArithmeticException
            //ArrayIndexOutOfBoundsException
            //NullPointerException
            System.out.println(avg);
        } catch (ArithmeticException e) {
            System.out.println("數學錯誤, 錯誤原因: "+e.getMessage());
        } catch (Exception e) {
            System.out.println("其他錯誤, 錯誤原因: "+e);
        }
    }
}
