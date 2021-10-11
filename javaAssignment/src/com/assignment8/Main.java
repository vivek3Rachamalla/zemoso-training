package com.assignment8;

public class Main {
    public static void main(String args[]){
        int i=0;
        try{
        switch (i){
            case 1:throw new Exception1("i am one");
            case 2:throw new Exception2("i am one");
            case 3:throw new Exception3("i am one");
            case 4:throw new NullPointerException("just throwing");

        }
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("i will get printed");
        }
    }
}
