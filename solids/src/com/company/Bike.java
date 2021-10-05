package com.company;

public class Bike implements Vehicle{
    @Override
    public int calInsurance(int value) {
        return value/3;
    }
}
