package com.ocp.Day14;
public class NewClass {
    public static void main(String[] args) {
        int i,j,k;
        int n = 5;//輸入要的層
        for(i = 1 ; i<=n ; i++)//層數的for迴圈
        {
            for( j = 1 ; j <=n-i ; j++)//根據外層行號，輸出星號左邊空格
                System.out.print(" ");
            for(k = 1 ; k <=2*i-1 ; k++)//根據外層行號，輸出星號個數
                System.out.print("*");
            System.out.println();
        }
        
        for(int p=5;p>=0;p--){
            for(int q=0;q<=5;q++){
                if(p>q){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
