package com.ocp.Day13;

class father{

    public father() {
        System.out.println("father");
    }
    public father(int x) {
        this();
        System.out.println("father"+x);
    }
    
}

class son extends father{
    public son() {
        this(100);
        System.out.println("son");
    }
    son(int x){
        super(x);
        System.out.println("Son"+x);
    }
}

public class familly {
    public static void main(String[] args) {
        son son =new son();
    }
}
