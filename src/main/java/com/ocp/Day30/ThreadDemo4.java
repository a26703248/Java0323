package com.ocp.Day30;

//UserThread 與 DeamonThread
public class ThreadDemo4 {
    public static void main(String[] args) {
        Runnable r = () ->{
            String name = Thread.currentThread().getName();
            for(int i = 0; i <= 1000; i++){
                System.out.printf("%s 跑了 %d 步\n", name, i);
            }
            System.out.printf("%s 工作完成\n", name);
        };
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        
        t1.start();
        t2.start();
        
        System.out.printf("%s 工作完成\n", Thread.currentThread().getName());
    }
}
