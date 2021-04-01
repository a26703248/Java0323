package com.ocp.Day09;
public class XOGame {
    public static void main(String[] args) {
        char[][] xo={{'o','x','o'},{' ','x','x'},{'o',' ',' '}};
        print(xo);
        System.out.println("輸入xo[1][0]  'o'");
        xo[1][0]='o';
        print(xo);
        
        
    }
    public static void print(char[][]xo){
        for (char[] c : xo) {
            System.out.print("| ");
            for (char d : c) {
                System.out.print(d + " | ");
            }
            System.out.println();
        }
    }
}
