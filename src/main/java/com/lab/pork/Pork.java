
package com.lab.pork;

public class Pork {
    private String market_name;
    private String addr;
    private String context;
    private String type;

    public String getMarket_name() {
        return market_name;
    }

    public void setMarket_name(String market_name) {
        this.market_name = market_name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Pork{" + "店家=" + market_name + ",地點=" + addr + ",商品=" + context + ",店家類型=" + type + '}';
    }

}
