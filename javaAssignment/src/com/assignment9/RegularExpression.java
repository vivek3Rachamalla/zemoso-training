package com.assignment9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String args[]){
        Pattern p=Pattern.compile("[A-Z][\\w\\s]*[\\.]");
        Matcher match=p.matcher("Damage it.");
        System.out.println(match.matches());
    }
}
