package com.ocp.Day25;
public class Product {
    private String name;//品名
    private int price;//價格

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "品名=" + name + ", 價格=" + price + '}';
    }
    
    
}
