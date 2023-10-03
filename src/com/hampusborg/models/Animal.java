package com.hampusborg.models;

//Abstract och Inheritance (ARV)
public interface Animal {

    //TODO
    // Private keyword - vis/mod
    // Uses keyword Implements

    //Abstract Method
    void name();
    void move();
    void eat();
    void sleep();
    void makeSound();



    //Default??
    default void TypeOfAnimal(String typeOfAnimal) {
        System.out.println(typeOfAnimal);

    }

}
