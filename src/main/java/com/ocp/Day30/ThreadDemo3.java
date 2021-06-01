package com.ocp.Day30;
//繼承 Thread 類別 
class RunningThread extends Thread{
    @Override
    public void run() {
        System.out.println("RunningThread....");
    }
}
//實作 Runnable 介面
class RunningRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("RunningRunnable....");
    }
}

public class ThreadDemo3 {
    public static void main(String[] args) {
        RunningThread rt = new RunningThread();
        rt.start();
        
        RunningRunnable rr= new RunningRunnable();
        Thread t1 = new Thread(rr);
        t1.start();
        
        Runnable r =() ->System.out.println("Java8 Runnable...");
        Thread t2 = new Thread(r);
        t2.start();
        
        
    }
}
