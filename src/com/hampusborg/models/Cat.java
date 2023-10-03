package com.hampusborg.models;

public class Cat implements Animal {

    @Override
    public void name() {
        System.out.println("Casper");
    }

    @Override
    public void move() {
        System.out.println("moves graciously");
    }

    @Override
    public void eat() {
        System.out.println("Omno nom nom");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeps 90 % of the time");
    }

    @Override
    public void makeSound() {
        System.out.println("Meow meow");
    }
}
