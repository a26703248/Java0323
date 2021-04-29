package com.ocp.Day17;
public class primeNumberMain {
    public static void main(String[] args) {
        primeNumber p=(a)->{
            for(int i=0;i<=a;i++){
                if(a==i&&a/i==1)
                    return true;
            }
            return false;
        };
        System.out.println(p.isPrime(9973));
    }
}
