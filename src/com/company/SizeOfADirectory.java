package com.company;

import java.io.File;

public class SizeOfADirectory {
    public static void main(String[] args) {
     File file = new File("C:\\Users\\s51637\\OneDrive - CAMPUS 02 Fachhochschule der Wirtschaft GmbH");
     lengthFile(file);
    }

    public static void lengthFile(File f){
      if(f.isDirectory()){
          long fileSize = 0;
          for(File file: f.listFiles()){
              if(file.isFile()){
                  System.out.println("Filename: " + file.getName() + "  " +  "Size: " + file.length());

                  fileSize = fileSize + file.length();
              }
          }
          System.out.println("Total size: " + fileSize);

        }
      else{
          System.out.println("Is not a directory");
      }
    }
}
