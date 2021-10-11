package com.assignment10;

public class SList<T> {
    T data;
    SList next=null;
    public SList(T data){
        this.data=data;
    }
    public SListIterator sListIterator(){
        return new SListIterator(this);
    }
}
