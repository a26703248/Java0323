
package com.lab.Rice;

public class Rice {
    private String 品名;
    private String 廠商名稱;
    private String 不合格項目;
    private String 行政處分;

    public String get品名() {
        return 品名;
    }

    public void set品名(String 品名) {
        this.品名 = 品名;
    }

    public String get廠商名稱() {
        return 廠商名稱;
    }

    public void set廠商名稱(String 廠商名稱) {
        this.廠商名稱 = 廠商名稱;
    }

    public String get不合格項目() {
        return 不合格項目;
    }

    public void set不合格項目(String 不合格項目) {
        this.不合格項目 = 不合格項目;
    }

    public String get行政處分() {
        return 行政處分;
    }

    public void set行政處分(String 行政處分) {
        this.行政處分 = 行政處分;
    }

    @Override
    public String toString() {
        return "Rice{" + "\u54c1\u540d=" + 品名 + ", \u5ee0\u5546\u540d\u7a31=" + 廠商名稱 + ", \u4e0d\u5408\u683c\u9805\u76ee=" + 不合格項目 + ", \u884c\u653f\u8655\u5206=" + 行政處分 + '}';
    }
    
    
}
