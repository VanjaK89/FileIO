package com.company;

import java.io.File;
import java.util.List;

public class FileOrDirectory {
    public static void main(String[] args) {
     File file = new File("C:\\Users\\s51637\\Desktop");
     dirOrFile(file.getAbsolutePath());
    }

    public static void dirOrFile(String path){
        File file = new File(path);
        File [] list = file.listFiles();

        for(File f: list){
            if(f.isFile()){
                System.out.println("File: " + f.getAbsolutePath());
            }
            else if(f.isDirectory()){
                System.out.println("Dir: " + f.getAbsolutePath());
            }
        }

    }


}
