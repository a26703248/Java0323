package com.ocp.Day28;
public class Demo {
    public static void main(String[] args) {
        try{
            System.out.println(Propagate("ABC"));
        }catch(Exception e){
            System.out.println("錯誤訊息: "+ e);
        }
    }
    
    public static String  Propagate(String s) throws Exception{
        String resverseStr="";
        if(s.length()<=0){
            throw new Exception("不可輸入空值");
        }
        for(int i=s.length()-1;i>=0;--i){
            resverseStr+=s.charAt(i);
        }
        return resverseStr;
    }
}
