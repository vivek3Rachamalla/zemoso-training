package com.assignment7.Rodent;

public class Main {
    public static void main(String args[]){
        Rodent[] arr=new Rodent[3];
        arr[1]=new Rat();
        arr[2]=new Hamster();
        arr[3]=new Squirrel();
        arr[1].makeSound();
        arr[2].eat();
        arr[3].makeSound();
    }
}
