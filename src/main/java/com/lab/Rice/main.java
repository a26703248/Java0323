
package com.lab.Rice;

import java.util.List;
import static java.util.stream.Collectors.toList;
import java.util.stream.Stream;

public class main {
    public static void main(String[] args) throws Exception {
        Stream.of(util.getRice())
                .filter(r->r.get品名().contains("日本"))
                .forEach(System.out::println);
        //將指定不合格的米放進集合中
        List badRice=Stream.of(util.getRice())
                .filter(r->r.get品名().contains("日本"))
                .collect(toList());
        System.out.printf("不合格比數: %d, 內容: %s\n",badRice.size(),badRice);
    }
}
