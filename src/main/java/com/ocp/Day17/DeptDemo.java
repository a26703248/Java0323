package com.ocp.Day17;
public class DeptDemo {
    public static void main(String[] args) {
        Dept dept=new Dept();
        Dept.stuff stuff1=dept.new stuff();
        stuff1.job();
        
        Dept.stuff stuff2=new Dept().new stuff();
        stuff2.job();
        
        new Dept().new stuff().job();
    }
}
