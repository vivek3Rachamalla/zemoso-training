package com.assignment5;

public class Singleton {
    String stringVarisble;
    private Singleton(String s){
        this.stringVarisble=s;
    }
    public static Singleton singletonObject(String s){
        return new Singleton(s);
    }
    public void getString(){
        System.out.println(this.stringVarisble);
    }
}
