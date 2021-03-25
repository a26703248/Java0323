package com.ocp.Day07;

public class ArrayBmi {

    public static void main(String[] args) {
        String[] name = {"A", "B", "C", "D", "E",};
        double[] h = {172, 168, 164, 170, 176};
        double[] w = {62, 57, 58, 64, 64};
        Person[] persons = new Person[5];
        for (int i = 0; i < persons.length; i++) {
            Person p = new Person(name[i], h[i], w[i]);
            persons[i] = p;
        }
        for (Person p:persons) {
            System.out.printf("%s的BMI:%.1f\n",p.name,p.bmi);
        }
        double[] bmis=new double[5];
        for (int i = 0; i <persons.length; i++) {
            bmis[i]=persons[i].bmi;
        }
        double bmis_cv=MyMath.cv(bmis);
        System.out.println((bmis_cv*100));
    }
}
