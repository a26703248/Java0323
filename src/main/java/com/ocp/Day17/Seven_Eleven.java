package com.ocp.Day17;

public class Seven_Eleven {
    //結帳方法
    public void submit(int price){
        //交易類別
        class Transaction{
            String name="維力炸醬麵";
            //交易資料
            void print(){
                System.out.printf("%s, 交易金額:%d\n",name,price);
            }
        }
        Transaction t=new Transaction();
        t.print();
    }
    public static void main(String[] args) {
        Seven_Eleven se=new Seven_Eleven();
        se.submit(100);
        
    }
}

