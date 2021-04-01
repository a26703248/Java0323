package com.ocp.Day07;
public class StringBuilderDelete {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("java cource");
        sb.delete(0,sb.length());//從0開始到<11的資料刪除
        System.out.println("sb="+sb);
    }
}