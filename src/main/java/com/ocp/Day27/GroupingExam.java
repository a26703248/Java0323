package com.ocp.Day27;

import java.util.*;
import java.util.stream.Collectors;

public class GroupingExam {
    public static void main(String[] args) {
        List<Exam> exams=Arrays.asList(
               new Exam("John", 100),
               new Exam("Mary", 50),
               new Exam("Helen", 70),
               new Exam("Tom", 80),
               new Exam("Bob", 30)
        );
        //請問及格/不及格的人數分組
        //{true=3, false=2}
        Map<String, Set<String>> result=exams.stream()
            .collect(Collectors.groupingBy(g->g.getScore()>=60 ? "及格":"不及格",
            Collectors.mapping(Exam::getName, Collectors.toSet())));
        System.out.println(result);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
