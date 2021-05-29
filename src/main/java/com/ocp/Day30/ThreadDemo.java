package com.ocp.Day30;

class Walking implements Runnable {

    @Override
    public void run() {
        Job();
    }
    
    private void Job() {
        String tname = Thread.currentThread().getName();
        for (int i = 0; i <= 1000; i++) {
            System.out.printf("%s 走了 %d 步 \n",tname ,i);
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        Walking w1 = new Walking();
        Walking w2 = new Walking();
        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w2);
        t1.start();
        t2.start();
    }
}
