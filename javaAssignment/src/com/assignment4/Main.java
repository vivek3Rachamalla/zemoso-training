package com.assignment4;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int numberOfInputs= sc.nextInt();
        String[] stringInputs=new String[numberOfInputs];
        sc.nextLine();
        for(int i=0;i<numberOfInputs;i++){
            stringInputs[i]=sc.nextLine();
        }
        displayRange(stringInputs,numberOfInputs);
    }
    public static void displayRange(String[] s,int num){
        String print;
        for(int i=0;i<num;i++) {
            print="No range";
            LocalDate currentDate= LocalDate.of(Integer.parseInt(s[i].substring(17, 21)),
                    Integer.parseInt(s[i].substring(14, 16)), Integer.parseInt(s[i].substring(11, 13)));

            LocalDate anniversaryDate=LocalDate.of(Integer.parseInt(s[i].substring(17, 21)),
                    Integer.parseInt(s[i].substring(3, 5)), Integer.parseInt(s[i].substring(0, 2)));

            if(Duration.between(currentDate.atStartOfDay(), anniversaryDate.atStartOfDay()).toDays()<30)
                print=convertToString(anniversaryDate,currentDate);
            else if(Integer.parseInt(s[i].substring(3, 5))==11){
                anniversaryDate.plusYears(1);
                if(Duration.between(currentDate.atStartOfDay(),anniversaryDate.atStartOfDay()).toDays()<30)
                    print=convertToString(anniversaryDate,currentDate);
            }
            else if(Integer.parseInt(s[i].substring(3, 5))==1){
                anniversaryDate.plusYears(1);
                if(Duration.between(currentDate,anniversaryDate).toDays()<30)
                    print=convertToString(anniversaryDate,currentDate);
            }
            System.out.println(print);
        }
    }
    public static String convertToString(LocalDate anniversary,LocalDate currentDate){
        String s=anniversary.minusDays(30).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")).toString();
            s+=" ";
            s+=currentDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")).toString();
        return s;
    }
}
