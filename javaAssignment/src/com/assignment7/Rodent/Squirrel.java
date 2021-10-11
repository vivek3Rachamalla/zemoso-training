package com.assignment7.Rodent;

import com.assignment7.Rodent.Rodent;

public class Squirrel implements Rodent {
    public Squirrel(){
        System.out.println("i am Squirrel");
    }

    @Override
    public void makeSound() {
        System.out.println("Squirrel sound");
    }

    @Override
    public void eat() {
        System.out.println("nuts");
    }
}
