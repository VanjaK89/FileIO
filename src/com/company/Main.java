package com.company;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\s51637\\Desktop\\pr3");
	    makingAdirectory(file);
    }
    public static void makingAdirectory(File f){
        if(f.isDirectory()){
            System.out.println("Directory exists: " + f.getAbsolutePath() + " " + "created?" + " " + f.mkdir());
        }
        else{
            System.out.println("Directory exists: " + f.getAbsolutePath() + " " + "created?" + " " + f.mkdir());
        }
    }
}
