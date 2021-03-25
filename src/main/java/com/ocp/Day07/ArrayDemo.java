package com.ocp.Day07;
public class ArrayDemo {
    public static void main(String[] args) {
        double[] nums=new double[]{10,20,30};
        double sum=0;
        for (double s:nums) {
            sum+=s;
        }
        System.out.println("sum="+sum);
        double avg=sum/nums.length;
        System.out.println("avg="+avg);
        double sumOfSqares=0;
        for (double n:nums) {
            sumOfSqares+=Math.pow(n-avg,2);
        }
        double sd=Math.sqrt((1.0/nums.length)*sumOfSqares);
        System.out.println("sd="+sd);
        double cv=sd/avg;
        System.out.println("cv="+cv);
    }
}
