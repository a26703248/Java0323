package com.ocp.Day29_assert;
//電力換算
//W(瓦數), V(電壓), A(電流)
//W = V * A
public class Power {
    //取得 W , 方法 getW(int v, int a)
    public int getW (int v, int a) {
        int w = v * a;
        return w;
    }
    //取得 A, 方法 getA(int w, int v)
    public int getA (int w, int v) {
        int a = w / v;
        return a;
    }
    //取得 V, 方法 getV(int w, int a)
    public int getV (int w, int a) {
        int v = w / a;
        return v;
    }
}
