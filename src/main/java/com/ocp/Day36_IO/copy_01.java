package com.ocp.Day36_IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class copy_01 {
    public static void main(String[] args) throws Exception {
        String fromPath = "src\\main\\java\\com\\ocp\\Day36_IO\\folder\\news.txt";
        String purposePath = "src\\main\\java\\com\\ocp\\Day36_IO\\folder\\news2.txt";
        File f1 = new File(purposePath);
        if(!f1.exists()){
            f1.createNewFile();
        }
        try(FileInputStream fis = new FileInputStream(fromPath);
                FileOutputStream fos = new FileOutputStream(purposePath, false);){
            int data = 0;
            while ((data = fis.read()) != -1) {
                fos.write((char)data);
            }
        }catch(Exception e){
        }
        
    }
}
