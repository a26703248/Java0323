package com.ocp.Day07;
public class MyMath {
    //總和
    public static double sum(double[] nums){
        double sum=0;
        for (double s:nums) {
            sum+=s;
        }
        return sum;
    }
    //平均
    public static double avg(double[] nums){
        double avg=0;
        double sum=0;
        avg=MyMath.sum(nums)/nums.length;
        return avg;
    }
    //標準差
    public static double sd(double[] nums){
        double sumOfSqares=0;
        double avg=MyMath.avg(nums);
        for (double n:nums) {
            sumOfSqares+=Math.pow(n-avg,2);
        }
        double SD=Math.sqrt((1.0/nums.length)*sumOfSqares);
        return SD;
    }
    //變異數差
    public static double cv(double[] nums){
        double sd=MyMath.sd(nums);
        double avg=MyMath.avg(nums);
        double cv=sd/avg;
        return cv;
    }
    
    public static String MethodA(double[] stocks,double[] bounds){
        return MyMath.cv(stocks)<MyMath.cv(bounds)?"公債穩健":"股票穩健";
    }
    public static String MethodB(double[] stocks,double[] bounds){
        int i=0;
        int j=0;
        double cv1=MyMath.avg(stocks);
        double cv2=MyMath.avg(bounds);
        
        for(int k=0;k<stocks.length;k++){
            if(cv1>stocks[k]){
                i++;
                
            }else{
               continue;
            }
        }
        for(int k=0;k<bounds.length;k++){
            if(cv2>bounds[k]){
                continue;
            }else{
               j++;
            }
        }
        return i>j?"股票比較賺":"公債比較賺";
    }
    public static double Max(double[] x){
        double Max=x[0];
        for (double i: x) {
            if(Max<i){
                Max=i;
            }
        }
        return Max;
    }
    public static double Min(double[] x){
        double Min=x[0];
        for (double i: x) {
            if(Min>i){
                Min=i;
            }
        }
        return Min;
    }
    
} 
