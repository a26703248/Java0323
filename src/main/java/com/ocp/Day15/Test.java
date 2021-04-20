package com.ocp.Day15;

import java.util.IntSummaryStatistics;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        Employee e1=new PG();
        e1.setSalary(5_000_000);
        Employee e2=new PG(1_000_000);
        Employee e3=new Art(28_000);
        Employee e4=new Art();
        e4.setSalary(30_000);
        
        Employee[] ep={e1,e2,e3,e4};
        Stream.of(ep).forEach(e->e.job());
        IntSummaryStatistics sum=Stream.of(ep)
                .mapToInt(e->e.getSalary())
                .summaryStatistics();
        System.out.println(sum.getAverage());
        System.out.println(sum.getSum());
    }
}
