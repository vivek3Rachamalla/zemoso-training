package com.assignment5;

public class Main {
    public static void main(){
        Data data=new Data();
        data.printInstanceVariables();
        //data.printLocalVariable();
        Singleton singleton=Singleton.singletonObject("hie");
        singleton.getString();

        /*
        data.printLocalVariable() will throw compiler error cos local vereiblws should be intsialised
        */
    }
}
