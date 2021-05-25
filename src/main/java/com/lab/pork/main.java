
package com.lab.pork;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class main {
    public static void main(String[] args)throws Exception {
        List<Pork> porks=Arrays.asList(util.getpork());
        //店家類型
        System.out.println(
                porks.stream().filter(p->p.getAddr().contains("桃園市"))
                .collect(Collectors.groupingBy(Pork::getType, Collectors.counting()))
        );
        //縣市
        System.out.println(
                porks.stream()
                .collect(Collectors.groupingBy(p->p.getAddr().substring(0,3), Collectors.counting()))
        );
        Stream.of(util.getpork())
                .filter(p->p.getAddr().contains("桃園市"))
                .forEach(System.out::println);
    }
}
