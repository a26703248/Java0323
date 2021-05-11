package com.lab.OrderSystem;

import java.util.*;

public class Main {

    private static List<Food> order = new ArrayList<>();
    private static DataCenter de = new DataCenter();
    private static ServiceCenter sc = new ServiceCenter();
    private static boolean play = true;

    public static void main(String[] args) throws Exception{
        while (play) {
            menu();
            Runtime.getRuntime().exec("cls");
        }
    }

    public static void menu() {
        sc.menu();
        System.out.print("請輸入: ");
        Scanner scanner = new Scanner(System.in);
        int itemid = scanner.nextInt();
        switch (itemid) {
            case 1://檢視
                sc.printCatalog();
                break;
            case 2://新增
                System.out.print("請輸入NO: ");
                int addno = scanner.nextInt();
                //在order集合中加入Food
                order.add(sc.getFoodbyNo(addno));
                break;
            case 3://查詢
                for (int i=0;i<order.size();i++) {
                    System.out.printf("id: %d,%s\n",i,order.get(i));
                }
                break;
            case 4://取消
                System.out.print("請輸入取消Id: ");
                int cancelId = scanner.nextInt();
                order.remove(cancelId);
                break;
            case 5://刪除
                order=new ArrayList<>();
                break;
            case 6://結帳
                int sum=order.stream().mapToInt(Food::getPrice).sum();
                System.out.printf("結帳: %d\n",sum);
                play=false;
                break;
            case 0://離開
                play=false;
                break;
        }
    }
}
