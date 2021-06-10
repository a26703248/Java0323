package com.ocp.Day37_NIO;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo {
    public static void main(String[] args) {
        Path path = Paths.get("src/main/java/com/ocp/day37_NIO/PathDemo.java");
        System.out.println("getFileName: " + path.getFileName());
        System.out.println("getParent: " + path.getParent().normalize());
        System.out.println("getRoot: " + path.getRoot());
        System.out.println("getNameCount: " + path.getNameCount());
        System.out.println("subpath(0, 2): " + path.subpath(0, 2));
        System.out.println("isAbsolute: " + path.isAbsolute());
        System.out.println("toAbsolutePath: " + path.toAbsolutePath());
        System.out.println("toUri: " + path.toUri());
        //path.getParent().normalize()去除過長(..)路徑
        //relsove() 連結路徑,如果連接路徑前方有 / 將會剩下後面要連接路徑,/ 在後方則不影響
        //.relativize() = cmd下 cd/
    }
}
