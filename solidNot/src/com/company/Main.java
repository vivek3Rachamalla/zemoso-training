package com.company;

public class Main {

    public static void main(String[] args) {
	client client1=new client("vivek",10000,"car",912548793L,"ex@gmail.com");
    int InsuranceValue=new CalculateInsurence(client1.getValue(),client1.getVehicle()).getIncValue();
    client1.email(InsuranceValue);
    client1.saveDb(client1,InsuranceValue);

    }
}
