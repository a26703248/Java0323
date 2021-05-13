
package com.lab.pork;

import java.util.stream.Stream;

public class main {
    public static void main(String[] args)throws Exception {
        Stream.of(util.getpork())
                //.filter(p->p.get地點().contains("桃園市"))
                .forEach(System.out::println);
    }
}
