package com.company;

public class Main {

    public static void main(String[] args) {
        IClient client=Create.getClient();
        client.setName("vivek");
        client.setEmail("ex@gmail.com");
        client.setNumber(952147896);
        client.setValue(1000);
        client.setVehicle(Create.getCar());

        IOperations oper=Create.getOperations();
        oper.getMessage().send(client.getVehicle().calInsurance(client.getValue()));
        oper.getDbObj().addData(client,client.getVehicle().calInsurance(client.getValue()));
    }
}
