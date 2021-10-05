package com.company;

public class Db implements IDataBase {

    @Override
    public void addData(IClient c,int value) {
        System.out.println("saved in database");
    }
}
