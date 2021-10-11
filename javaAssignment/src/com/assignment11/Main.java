package com.assignment11;

import java.io.FileWriter;
import java.util.HashSet;

public class Main {
    public static void main(String args[]){
        String s="write";
        HashSet<Character> hs=new HashSet<>();
        for(int i=0;i<s.length();i++){
         hs.add(s.charAt(i));
        }
        try {
            FileWriter fs = new FileWriter("src/com/assignment11/write.txt");
            fs.write("there are"+hs.size()+"characters in file name");
            fs.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
