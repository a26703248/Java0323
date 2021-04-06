package com.lab;

import java.util.IntSummaryStatistics;
import java.util.stream.Stream;

public class Java8Study7 {
    public static void main(String[] args) {
        String[][] names={{"Joe","Mary",},{"John","Helen"},{"Bob"}};
        IntSummaryStatistics stat=Stream.of(names)
                .flatMap(Stream::of)
                .mapToInt(String::length)
                .summaryStatistics();
        System.out.println(stat.getSum());
        int sum=Stream.of(names)
                .flatMap(Stream::of)
                .mapToInt(String::length)
                .sum();
    }
}
