package com.ocp.Day28;
public class LogFailException extends Exception{

    public LogFailException() {
    }

    public LogFailException(String errorMessage) {
        super(errorMessage);
    }
    
    public void where(){
        System.out.println("請重新登入");
    }
}
