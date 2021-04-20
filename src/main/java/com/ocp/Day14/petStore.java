package com.ocp.Day14;

import java.util.stream.Stream;

public class petStore {
    public static void main(String[] args) {
        Pet a1=new Dog();
        Pet a2=new Cat();
        Pet a3=new ePet();
        a1.move();
        a1.eat();
        a2.move();
        a2.eat();
        a3.move();
        a3.eat();
        System.out.println(Animal.legs);
        System.out.println(Dog.legs);
        System.out.println(Cat.legs);
        System.out.println(ePet.legs);
        Pet[] pets={a1,a2,a3};
        Stream.of(pets).forEach(s->s.eat());
    }
}
