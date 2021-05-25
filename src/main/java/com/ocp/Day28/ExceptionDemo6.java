package com.ocp.Day28;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import javax.swing.JOptionPane;

public class ExceptionDemo6 {
    public static void main(String[] args) {
        File file=new File("src\\main\\java\\com\\ocp\\Day28\\ExceptionDemo6.java");
        try {
            Scanner scanner=new Scanner(file);
            System.out.println("檔案存在");
        } catch (FileNotFoundException e) {
            System.out.println("檔案不存在 !"+ e);
        }
    }
}
