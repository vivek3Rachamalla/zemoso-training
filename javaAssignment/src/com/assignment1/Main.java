package com.assignment1;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        String baseDirectory="C:\\Users\\raxha\\OneDrive\\Documents";
        findFile("hello.txt",baseDirectory);
    }
    public static void findFile(String fileName,String directoryPath){
        File fileDirectory=new File(directoryPath);
        File files[]=fileDirectory.listFiles();
        for(File file : files ){
            if(file.isDirectory()) findFile(fileName,directoryPath+"\\"+file.getName());
            else if(file.getName().equals(fileName)) System.out.println(file.getAbsolutePath());
        }
    }
}
