package com.ocp.Day30;

public class HomeWorkException {
    public static void main(String[] args) {
        String s = "";
        Propagate p = new Propagate();
        try{
            p.reverse(s);
        }catch(Exception e){
            System.out.println("錯誤訊息: " + e);
        }finally{
            System.out.println("完成");
        }
    }
}
class Propagate{
    public String reverse(String s)throws Exception{
        String reverseStr = "";
        if(s.length() <= 0){
            throw new Exception("內容不能為零或零以下");
        }
        for(int i = s.length() - 1; i >= 0;--i){
            reverseStr +=s.charAt(i);
        }
        return reverseStr;
    }
}