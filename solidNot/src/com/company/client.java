package com.company;

public class client {

    private String name;
    private int value;
    private String vehicle;
    private long number;
    private String email;

    public client(String name, int value, String vehicle, long number, String email) {
        this.name = name;
        this.value = value;
        this.vehicle = vehicle;
        this.number = number;
        this.email = email;
    }

    public void saveDb(client c,int value){
        new Db().saved(c,value);
    }

    public void email(int amount){
        new sendEmail().send(this.email,amount);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

