package com.ocp.Day30;

import java.util.Random;

class Account {//銀行帳戶

    private int balance;//帳戶餘額

    public Account(int balance) {
        this.balance = balance;
    }

    public void withdraw(int cash) throws Exception {
        String name = Thread.currentThread().getName();
        System.out.printf("%s 準備提款...\n", name);
        //取得帳戶餘額
        int currentBalance = balance;
        if (currentBalance >= cash) {// 是否餘額足夠提款
            // 開始提款
            Thread.sleep(new Random().nextInt(100));// 模擬提款所花費的時間
            // 提款成功
            // 回寫帳戶餘額
            balance -= cash;
            // 印出交易單
            System.out.printf("%s 提款: $%,d 成功 帳戶餘額: $%,d\n",
                                name, cash, balance);

        } else {
            System.out.println("失敗, 餘額不足");
        }
    }

}

class WithDraw implements Runnable {// 提款執行緒

    private Account account;
    private int cash;

    public WithDraw(Account account, int cash) {
        this.account = account;
        this.cash = cash;
    }

    @Override
    public void run() {
        try {
            account.withdraw(cash);// 進行提款作業
        } catch (Exception e) {
        }
    }

}

public class ATM {

}
