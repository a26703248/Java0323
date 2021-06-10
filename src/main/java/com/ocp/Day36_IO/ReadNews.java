package com.ocp.Day36_IO;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.Reader;

public class ReadNews {
    public static void main(String[] args) {
        String news = "src\\main\\java\\com\\ocp\\Day36_IO\\folder\\news.txt";
        
        try (FileInputStream fis = new FileInputStream(news);
                // byte[] 轉 char[] 可以支援指定編碼
                InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
                BufferedReader br = new BufferedReader(isr);){
            String data = null;
            while ((data = br.readLine()) != null) {
                System.out.println(data);
            }
        } catch (Exception e) {
        }
    }
}
