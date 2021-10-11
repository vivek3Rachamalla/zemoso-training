package com.assignment7.Rodent;

public class Hamster implements Rodent {
    public Hamster(){
        System.out.println("i am Hamster");
    }

    @Override
    public void makeSound() {
        System.out.println("Hamster sound");
    }

    @Override
    public void eat() {
        System.out.println("carrot");
    }
}
