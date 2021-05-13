
package com.lab.pork;

public class Pork {
    private String 店家;
    private String 地點;
    private String 商品;
    private String 類型;

    public String get店家() {
        return 店家;
    }

    public void set店家(String 店家) {
        this.店家 = 店家;
    }

    public String get地點() {
        return 地點;
    }

    public void set地點(String 地點) {
        this.地點 = 地點;
    }

    public String get商品() {
        return 商品;
    }

    public void set商品(String 商品) {
        this.商品 = 商品;
    }

    public String get類型() {
        return 類型;
    }

    public void set類型(String 類型) {
        this.類型 = 類型;
    }

    @Override
    public String toString() {
        return "Pork{" + "\u5e97\u5bb6=" + 店家 + ", \u5730\u9ede=" + 地點 + ", \u5546\u54c1=" + 商品 + ", \u985e\u578b=" + 類型 + '}';
    }
    
}
