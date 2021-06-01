package com.ocp.Day30;

import java.math.BigDecimal;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import yahoofinance.YahooFinance;

/*
利用 Callable 與 YahooFinance api 取得台積電最新報價
台積電的代號: 2330.TW
*/
class Stock implements Callable<Double>{
    private String symbol;

    public Stock(String symbol) {
        this.symbol = symbol;
    }
    
    
    @Override
    public Double call() throws Exception {
        yahoofinance.Stock stock = YahooFinance.get(symbol);
        BigDecimal price = stock.getQuote().getPrice();
        return price.doubleValue();
    }
}

public class CallableDemo2 {
    public static void main(String[] args) throws Exception{
        //假設欲購買台積電 1500 股請問交易成本為何?
        //手續費 = 交易成本 * 0.001425
        String symbol = "2330.TW";
        int amount = 1500;
        
        Stock sk =new Stock(symbol);
        FutureTask<Double> ft = new FutureTask<>(sk);
        new Thread(ft).start();
        
        double price = ft.get();
        double cost = amount * price;
        double fee = cost * 0.001425;
        double total = cost + fee;
        
        System.out.printf("買進: %s price: $%,.1f amount: %,d 股 cost: $%,.1f fee: $%1f total: $%,.2f",
                            symbol, price, amount, cost, fee, total);
        
    }
}
