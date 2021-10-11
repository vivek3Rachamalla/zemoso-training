package com.assignment7.Rodent;

public class Rat implements Rodent {

    public Rat(){
        System.out.println("i am rat");
    }

    @Override
    public void makeSound() {
        System.out.println("rat sound");
    }

    @Override
    public void eat() {
        System.out.println("cheese");
    }
}
