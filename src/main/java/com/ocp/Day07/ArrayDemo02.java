package com.ocp.Day07;
//調查五位學生之身高及體重如下，試比較其分散程度。
//            身高：172、168、164、170、176(公分)
//            體重：62、57、58、64、64(公斤)
public class ArrayDemo02 {
    public static void main(String[] args) {
        double[] h={172,168,164,170,176};
        double[] w={62,57,58,64,64};
        System.out.printf(MyMath.MethodA(h, w));
    }
}