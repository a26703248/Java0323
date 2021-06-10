package com.ocp.Day36_IO.folder;

import java.io.File;
import java.io.FileReader;

public class ReadFile_Salary2 {
    public static void main(String[] args) {
        File file = new File("src\\main\\java\\com\\ocp\\Day36_IO\\folder\\salary.txt");
        
        //try-with-resource(自動關閉檔案)
        //有實作Closeable的類才可以放入
        try(FileReader fr = new FileReader(file)){
            
            int ch = 0;
            while((ch = fr.read()) != -1){
                System.out.print((char)ch);
            }
        }catch(Exception e){
        }
        
    }
}
