package com.assignment2;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String inputChar=sc.nextLine();
        boolean isSmall=true;
        for(int i=0;i<inputChar.length();i++) {
            if ('a'<= inputChar.charAt(i) && inputChar.charAt(i) <='z') continue;
            else{
                isSmall=false;
                break;
            }
        }
        System.out.println(isSmall);
    }
}
