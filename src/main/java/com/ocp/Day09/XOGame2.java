package com.ocp.Day09;

import java.util.Random;
import java.util.Scanner;

public class XOGame2 {

    public static void main(String[] args) {
        String[][] xo = new String[3][3];
        for (int i = 0; i < xo.length; i++) {
            for (int j = 0; j < xo[i].length; j++) {
                xo[i][j] = "";
            }
        }
        do {
            Scanner sc = new Scanner(System.in);
            print(xo);
            System.out.print("請選擇0~8--->");
            int n = sc.nextInt();
            if (xo[n / 3][n % 3] == "") {
                xo[n / 3][n % 3] = "o";
            }else{
                System.out.println("請重新指定");
                continue;
            }
            while (true) {
                int m = new Random().nextInt(9);
                if (xo[m / 3][m % 3] == "") {
                    xo[m / 3][m % 3] = "x";
                    break;
                }
            }
            if (equals(xo, "x")) {
                System.out.println("電腦勝利");
                break;
            } else if (equals(xo, "o")) {
                System.out.println("玩家勝利");
                break;
            }
        } while (true);
        print(xo);
    }

    public static void print(String[][] xo) {
        for (String[] c : xo) {
            System.out.print("| ");
            for (String d : c) {
                System.out.print(d + " | ");
            }
            System.out.println();
        }
    }

    public static boolean equals(String[][] xo, String XO) {
        boolean flag;
        if (horizontal(xo, XO)) {
            return flag = true;
        } else if (straight(xo, XO)) {
            return flag = true;
        } else if (oblique(xo, XO)) {
            return flag = true;
        } else {
            return flag = false;
        }
    }

    public static boolean horizontal(String[][] xo, String XO) {//橫
        boolean key = false;
        int flag = 0;
        for (int i = 0; i < xo.length; i++) {
            flag = 0;
            for (int j = 0; j < xo[i].length; j++) {
                if (xo[i][j].equals(XO)) {
                    flag++;
                }
            }
            if (flag == 3) {
                key = true;
            }
        }
        return key;
    }

    public static boolean straight(String[][] xo, String XO) {//直
        boolean key = false;
        int flag = 0;
        for (int i = 0; i < xo.length; i++) {
            flag = 0;
            for (int j = 0; j < xo[i].length; j++) {
                if (xo[j][i].equals(XO)) {
                    flag++;
                }
            }
            if (flag == 3) {
                key = true;
            }
        }
        return key;
    }

    public static boolean oblique(String[][] xo, String XO) {//斜
        boolean key = false;
        int flag = 0;
        for (int i = 0; i < xo.length; i++) {
            if (xo[i][i].equals(XO)) {
                flag++;
            }
        }
        if (flag == 3) {
            key = true;
        }
        return key;
    }

}
