package com.assignment10;

public class SListIterator<T> {
    SList<T> head;
    SList<T> prevHead;
    SListIterator(SList<T> head){
        this.head=head;
        this.prevHead=head;
    }

    public boolean hasNext(){
        if(head!=null) return true;
        return false;
    }
    public T next(){
        prevHead=head;
        head=head.next;
        return prevHead.data;
    }
    public void add(T data){
        SList<T> addObj=new SList<T>(data);
        if(head.next==null) head.next=addObj;
        else {
            SList<T> temp = head.next;
            head.next = addObj;
            addObj.next = temp;
        }
    }
    public void remove(){
        if(head==prevHead){
            prevHead=head.next;
            head=prevHead;
            head.next=null;
        }
        else if(head.next==null) prevHead.next=null;
        else prevHead.next=head.next;

    }
}
