package com.ocp.Day33_executor;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Lotto implements Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(new Random().nextInt(1000));
            int num = new Random().nextInt(100);
            System.out.println(num);
        } catch (Exception e) {
        }
    }
    
}

public class ThreadPoolExecutorDemo {
    public static void main(String[] args) {
        System.out.println("請給我10組 Lotto 數字");
        //ExecutorService serivce = Executors.newFixedThreadPool(10);
        ExecutorService serivce = Executors.newCachedThreadPool();
        for (int i = 0; i <= 100; i++) {
            serivce.submit(new Lotto());
        }
        System.out.printf("Thread count: %d\n",Thread.activeCount());
        serivce.shutdown();
    }
}
