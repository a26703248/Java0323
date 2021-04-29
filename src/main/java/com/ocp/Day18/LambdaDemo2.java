package com.ocp.Day18;

import java.util.DoubleSummaryStatistics;
import java.util.stream.Stream;

public class LambdaDemo2 {
    public static void main(String[] args) {
        DoubleSummaryStatistics ds=Stream.of("國文", 100.0, "英文", 90.5, "數學", 0.5, "座號", 7)
                .filter(i->i instanceof Double)
                .mapToDouble(x -> (double)x)
                .summaryStatistics();
        System.out.println(ds.getSum());
        System.out.println(ds.getAverage());
        
        
        
        
        
        
        
        
        
    }
}
