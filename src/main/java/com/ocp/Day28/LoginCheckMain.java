package com.ocp.Day28;
public class LoginCheckMain {
    public static void main(String[] args){
        String name = "admin";
        String password = "1234";
        
        LoginService service = new LoginService();
        
        try {
            System.out.println(service.login(name, password));
        } catch (LogFailException e) {
            System.out.println(e.getMessage());
            e.where();
        }
        
    }
}
