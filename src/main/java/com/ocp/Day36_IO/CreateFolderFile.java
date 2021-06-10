package com.ocp.Day36_IO;

import java.io.File;
import java.io.IOException;

public class CreateFolderFile {

    public static void main(String[] args) throws IOException {
        //想在 Day36_IO 資料夾下面 建立  files 資料夾
        File folder = new File("src\\main\\java\\com\\ocp\\Day36_IO\\folder");
        if (!folder.exists()) {//不存在再建立
            folder.mkdir();//建立資料夾
        }
        //然後Day36_IO/files 資料夾下面 建立  salary.txt 檔案
        File f = new File("src\\main\\java\\com\\ocp\\Day36_IO\\folder\\salary.txt");
        if (!f.exists()) {
            f.createNewFile();
        }
        File f2 = new File("src\\main\\java\\com\\ocp\\Day36_IO\\folder\\");
        System.out.println(f2.isDirectory());
        System.out.println(f2.isFile());
    }
}
