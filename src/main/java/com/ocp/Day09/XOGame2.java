package com.ocp.Day09;

import java.util.Random;
import java.util.Scanner;

public class XOGame2 {

    public static void main(String[] args) {
        char[][] xo = new char[3][3];
        do {
            Scanner sc = new Scanner(System.in);
            print(xo);
            System.out.print("請選擇0~8--->" );
            int n = sc.nextInt();
            xo[n / 3][n % 3] = 'o';
            while (true) {
                int m = new Random().nextInt(9);
                if (xo[n / 3][n % 3] == '\u0000') {
                    xo[n / 3][n % 3] = 'x';
                    break;
                }
            }
        } while (true);

    }

    public static void print(char[][] xo) {
        for (char[] c : xo) {
            System.out.print("| ");
            for (char d : c) {
                System.out.print(d + " | ");
            }
            System.out.println();
        }
    }
}
