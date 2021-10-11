package com.assignment10;



public class Main {
    public static void main(String args[]){
        SList<Integer> head=new SList<Integer>(1);
        head.next=new SList<Integer>(2);
        SListIterator<Integer> it=head.sListIterator();
        it.add(12);
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
