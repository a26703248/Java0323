package com.lab;

import java.util.Arrays;
import java.util.Scanner;

public class AbGuessNumber {

    public static void main(String[] args) {
        int[] ansArray = util.getAnswerArray();
        System.out.println(Arrays.toString(ansArray));
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("請輸入不重複的四個數字: ");
            String guess = sc.next();
            int[] guessArray = {guess.charAt(0) - 48, guess.charAt(1) - 48, guess.charAt(2) - 48, guess.charAt(3) - 48};
            int a = 0, b = 0;
            for (int i = 0; i < 4; i++) {
                if (ansArray[i] == guessArray[i]) {
                    a++;
                }
            }
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < i; j++) {
                    if (ansArray[i] == guessArray[j]) {
                        b++;
                        break;
                    }
                }
            }
            b-=a;
            if(b<0)
                b=0;
            System.out.println("A:"+a+" B:"+b);
            if(a==4){
                System.out.println("答對了");
                break;
            }
        } while (true);
    }
}
