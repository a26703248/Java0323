package com.ocp.Day17;

//外部類別
public class Dept {
    String name = "IT部門";
    public static final String companyName="Yange";
    //內部類別
    public class stuff{
        private  String name = "John";
        public void job(){
            String name = "寫程式";
            System.out.printf("%s在%s公司%s下%s\n",
                 this.name ,Dept.companyName,Dept.this.name,name
            );
        }
    }
}
