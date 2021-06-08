package com.ocp.Day35;

public class Lotto {
    private int nachineNumber;// 機器號碼
    private int lottoNumber;// 樂透彩球號碼
    private String name;//執行緒明稱

    public Lotto(int nachineNumber, int lottoNumber, String name) {
        this.nachineNumber = nachineNumber;
        this.lottoNumber = lottoNumber;
        this.name = name;
    }

    public int getNachineNumber() {
        return nachineNumber;
    }

    public void setNachineNumber(int nachineNumber) {
        this.nachineNumber = nachineNumber;
    }

    public int getLottoNumber() {
        return lottoNumber;
    }

    public void setLottoNumber(int lottoNumber) {
        this.lottoNumber = lottoNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Lotto{" + "nachineNumber=" + nachineNumber + ", lottoNumber=" + lottoNumber + ", name=" + name + '}';
    }
    
}
