package com.ocp.Day28;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.util.Date;

public class ExceptionDemo7 {
    public static void main(String[] args) {
        String mybirthday = "2000/1/e";
        DateFormat df=DateFormat.getDateInstance();
        try{
            Date date=df.parse(mybirthday);
            System.out.println(date);
        } catch (ParseException e) {
            System.out.println("日期轉換失敗, "+ e );
        }
        
        
        
    }
}
