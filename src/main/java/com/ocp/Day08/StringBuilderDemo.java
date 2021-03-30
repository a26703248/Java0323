package com.ocp.Day08;
public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("吃葡萄吐葡萄");
        //"吃葡萄不吐葡萄皮"
        sb.append("皮");//新增
        System.out.println(sb);
        sb.insert(3, "不");//插入
        System.out.println(sb);
        sb.replace(1, 2, "葡");//刪除索引字串
        System.out.println(sb);
        sb.delete(0,4);//刪除索引字串
        System.out.println(sb);
        sb.delete(3, sb.length());
        System.out.println(sb);
    }
}
