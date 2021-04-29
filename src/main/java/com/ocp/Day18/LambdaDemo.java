package com.ocp.Day18;

import java.util.stream.IntStream;

public class LambdaDemo {
    public static void main(String[] args) {
        int[] scores={100, 50, 70, 80, 30};
        IntStream.of(scores)
                .forEach(System.out::println);
        
    }
}
