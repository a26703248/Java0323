package com.ocp.Day12;
public class Director extends Manager{

    private int stockoption;

    public int getStockoption() {
        return stockoption;
    }

    public void setStockoption(int stockoption) {
        this.stockoption = stockoption;
    }
    @Override
    public String toString() {
        return "Director{" + "stockoption=" + stockoption + ", budget=" + getBudget() +", salary:"+getSalary()+ '}';
    }
}
