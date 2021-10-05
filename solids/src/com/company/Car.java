package com.company;

public class Car implements Vehicle{
    @Override
    public int calInsurance(int value) {
        return value/3;
    }
}
