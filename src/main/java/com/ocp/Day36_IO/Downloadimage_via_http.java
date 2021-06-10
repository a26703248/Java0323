package com.ocp.Day36_IO;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
//Download 讀取 -> 寫檔

public class Downloadimage_via_http {

    public static void main(String[] args) throws Exception {
        String fromPath = "https://ichef.bbci.co.uk/news/976/cpsprodpb/C448/production/_117684205_lotus.jpg";
        URL url = new URL(fromPath);
        String savePath = "src/main/java/com/ocp/day36_io/folder/car.jpg";

        /*
        byte[] chs = new byte[is.available()*10];// available 資料長度
        is.read(chs);//將資料寫進 chs 陣列
        FileOutputStream fos = new FileOutputStream("src\\main\\java\\com\\ocp\\Day36_IO\\folder\\car.jpg");
        fos.write(chs);
         */
        try (InputStream is = url.openConnection().getInputStream();
             FileOutputStream fos = new FileOutputStream(savePath, false);) {

            int ch = 0;
            // 邊讀邊寫
            while ((ch = is.read()) != -1) { // 邊讀 
                System.out.print(ch);
                fos.write(ch); // 邊寫
            }

        } catch (Exception e) {
        }
    }
}
