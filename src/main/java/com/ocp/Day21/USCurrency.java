package com.ocp.Day21;
//PENNY 一美分,NICKLE 五美分
//DIME 十美分,QUARTER 25美分
public enum USCurrency {
    PENNY(1),
    NICKLE(5),
    DIME(10),
    QUARTER(25);
    
    
    private int value;
    
    private USCurrency(int value) {
        this.value = value;
    }
    public int  getValue(){
        return value;
    }
}
/*singleTon(單一實體)結構






*/
