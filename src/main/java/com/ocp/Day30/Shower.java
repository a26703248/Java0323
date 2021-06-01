package com.ocp.Day30;

class FatherThread extends Thread{//爸爸執行緒

    @Override
    public void run() {
        System.out.println("爸爸下班回家");
        System.out.println("準備洗澡");
        System.out.println("爸爸發現沒瓦斯了");
        System.out.println("爸爸打電話請瓦斯工人送瓦斯");
        
        WorkerThread worker = new WorkerThread();
        worker.start();
        
        System.out.println("開始洗澡");
        System.out.println("洗完澡了");
    }
    
}

class WorkerThread extends Thread{//瓦斯工人執行緒

    @Override
    public void run() {
        System.out.println("瓦斯工人準備開始送瓦斯");
        for (int i = 0; i <=  5; i++) {
            System.out.printf("%d 秒鐘\n");
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                System.out.println("發身意外: " + e);
            }
        }
        System.out.println("瓦斯工人將瓦斯送到府");
    }
    
}

public class Shower {
    public static void main(String[] args) {
        FatherThread ft =new FatherThread();
        ft.start();
        
    }
}
