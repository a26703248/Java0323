package com.ocp.Day28;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ExceptionDemo8 {
    
    public static void main(String[] args) {
        System.out.println(login("admin", "1234"));
        System.out.println(login("admin", "5678"));
        System.out.println(login("guest", "1234"));
        System.out.println(login("guest", "5678"));
        
        try {
            System.out.println(login2("admin", "1234"));
        } catch (Exception ex) {
            System.out.println("登入失敗原因: "+ex.getMessage());
        }
    }
    
    public static boolean login2(String username,String password) throws Exception {
        //驗證 username
        if(!username.equals("admin")){
            throw new Exception("使用者名稱錯誤");
        }
        //驗證 password
        if(!password.equals("1234")){
            throw new Exception("使用者密碼錯誤");
        }
        return true;
    }
    
    public static boolean login(String username,String password) {
        if(username.equals("admin")&&password.equals("1234")){
            return true;
        }
        return false;
    }
}
