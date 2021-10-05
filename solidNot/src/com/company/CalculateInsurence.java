package com.company;

public class CalculateInsurence {
    private int IncValue;
    CalculateInsurence(int value,String type){
        this.IncValue=cal(value,type);
    }
    public int cal(int value,String type){
        if(type.equals("car")) return value/2;
        else if(type.equals("bike")) return value/3;
        return -404;
    }

    public int getIncValue() {
        return IncValue;
    }
}
