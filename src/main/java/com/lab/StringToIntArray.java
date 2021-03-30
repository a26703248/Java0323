package com.lab;
public class StringToIntArray {
    public static void main(String[] args) {
        String s="5841";
        int[] guessArrays={s.charAt(0)-48,s.charAt(1)-48,s.charAt(2)-48,s.charAt(3)-48};
        System.out.println(guessArrays[0]);
        System.out.println(guessArrays[1]);
        System.out.println(guessArrays[2]);
        System.out.println(guessArrays[3]);
    }
}
