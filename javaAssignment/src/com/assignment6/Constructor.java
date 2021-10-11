package com.assignment6;

public class Constructor {
    int i;
    public Constructor(){
        this(1);
    }
    public Constructor(int i){
        this.i=i;
    }
    public static void main(String args[]){
        Constructor consObj=new Constructor();
        System.out.println(consObj.i);
    }
}
