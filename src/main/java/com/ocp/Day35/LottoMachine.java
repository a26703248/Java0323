package com.ocp.Day35;

import java.util.Random;
import java.util.concurrent.Callable;

public class LottoMachine implements Callable<Lotto>{
    private int num;

    public LottoMachine(int num) {
        this.num = num;
    }

    @Override
    public Lotto call() throws Exception {
        Random r = new Random();
        //搖獎
        Thread.sleep(new Random().nextInt(3000));
        int lottoNumber = r.nextInt(39)+1;
        //取出(建立)樂透彩球
        Lotto lotto = new Lotto(num, num, Thread.currentThread().getName());
        return lotto;
    }
    
}
