package com.ocp.Day28;
public class Propagate {
    public static void main(String[] args) {
        try{
            System.out.println(resverse("java"));
        }catch(Exception e){
            System.out.println("錯誤訊息: "+ e);
        }
        System.out.println("");
    }
    
    public static String  resverse(String s) throws Exception{
        String resverseStr="";
        if(s.length() <= 0 || s == null || !s.isEmpty()){
            throw new Exception("不可輸入空白");
        }
        for(int i=s.length()-1;i>=0;--i){
            resverseStr+=s.charAt(i);
        }
        return resverseStr;
    }
}
