package com.ocp.Day23;
import java.util.*;
public class SetDemo3 {
    public static void main(String[] args) {
        //泛型<>:型別限定
        Set<Integer> scores=new LinkedHashSet<>();
        int sum=0;
        scores.add(100);
        scores.add(2000);
        scores.add(90);
        scores.add(80);
        //scores.add(3.14);
        //scores.add(true);
        System.out.println(scores);
        Iterator<Integer> iter=scores.iterator();
        while (iter.hasNext()) {
            Integer next = iter.next();
            sum+=next;
        }
        sum=scores.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }
}
