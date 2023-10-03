package com.hampusborg.models;

//Abstract class - marked by keyword Abstract
// can inherit from both Interface and abstract classes
abstract class AAnimal {

    // Includes abstract, excludes body  {}
    public abstract void eat();


    // Ordinary method - excludes abstract
    public void makeSound() {
        System.out.println("Squeek");
    }

}
