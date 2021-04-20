package com.ocp.Day16;

import java.util.stream.Stream;

public class Army {
    public static void main(String[] args) {
        Fighter fighter=new Fighter();
        Tank tank=new Tank();
        Truck truck=new Truck();
        
        Car[] cars={tank,truck};
        Weapon[] weapons={fighter,tank};
        Stream.of(cars).forEach(c->c.move());
        Stream.of(weapons).forEach(w->w.shoot());
        Oil[] spmd={fighter,tank,truck};
        int oilSum=Stream.of(spmd)
                .mapToInt(Oil::spmd)
                .sum();
        System.out.println(oilSum);
    }
}
