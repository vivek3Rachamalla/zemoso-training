package com.company;

public class Client implements IClient{
    private String name;
    private int value;
    private Vehicle vehicle;
    private long number;
    private String email;

    public Client(){

    }

    public Client(String name, int value, Vehicle vehicle, long number, String email) {
        this.name = name;
        this.value = value;
        this.vehicle = vehicle;
        this.number = number;
        this.email = email;
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

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
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
