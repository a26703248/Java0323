package com.ocp.Day34;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SchedulerLottoFemo {
    public static void main(String[] args) {
        Runnable r = () ->{
            int delay = new Random().nextInt(2000);//每次開獎所花費的時間
            try {
                Thread.sleep(delay);
            } catch (Exception e) {
            }
            int n = new Random().nextInt(9)+1;
            System.out.printf("開獎時間: %d 花費時間: %.1f 開獎時間: %s\n",
                    n, delay/1000.0, new Date());
        };
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        //初始的 delay
        int initDelay = 0;
        //delay
        int delay = 3;//下次開獎的時間(EX: 3秒後);
        //開獎後每隔 3 秒鐘開一次講
        service.scheduleWithFixedDelay(r, initDelay, delay, TimeUnit.SECONDS);
    }
}
