package com.ocp.Day22;

import java.util.Arrays;
import java.util.Random;
//singleton(單一實體)
public class Lotto {
    private String value;
    private static Lotto l=new Lotto();
    
    public static Lotto getLotto(){
        return l;
    }
    
    private Lotto(){
        Random r=new Random();
        int[] values={
            r.nextInt(9)+1,
            r.nextInt(9)+1,
            r.nextInt(9)+1,
            r.nextInt(9)+1
        };
        value=Arrays.toString(values);
    }
    public String getValues(){
        return value.toString();
    }
}
