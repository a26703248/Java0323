
package com.cdc;

import java.util.stream.Stream;

public class main {
    public static void main(String[] args) throws Exception {
        CDC[] cdcs=Util.getCdcs();
        Stream.of(cdcs)
                .filter(c->c.getSent().contains("2021-05-13"))
                .filter(c->c.getHeadline().contains("新型冠狀病毒"))
                .peek(c->c.setDustance(Util.distance(c.getCircle(), "24.0,121.0")/1000))
                .forEach(c->{
                    System.out.println(c.getHeadline());
                    System.out.println(c.getDescription().trim());
                    System.out.println(c.getDustance());
                });
        
    }
}
