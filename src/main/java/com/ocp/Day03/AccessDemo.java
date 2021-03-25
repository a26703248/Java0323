package com.ocp.Day03;

import com.ocp.Day03.bar.John;
import com.ocp.Day03.bar.Mary;
import com.ocp.Day03.foo.Bob;
import com.ocp.Day03.foo.Hellen;

public class AccessDemo {
    public static void main(String[] args) {
        John j=new John();
        j.print();
        Mary m=new Mary();
        m.print();
        Bob b=new Bob();
        b.print();
        Hellen h=new Hellen();
        h.print();
    }
}
