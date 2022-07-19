package com.company;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

public class MehrereDirectories {
    public static void main(String[] args) {


    }
    public static void createFiles(File f) {
        for (int i = 0; i < 10; i++) {
            try {
                File file = new File(f.getAbsolutePath() + "//"
                        + ThreadLocalRandom.current().nextInt() + ".mp3");

                if (file.createNewFile()) {
                    System.out.println("CREATE: " + file.getAbsolutePath());
                } else {
                    System.out.println("File already exists.");
                }

            } catch (IOException e) {
                System.out.println("An error occured");
                e.printStackTrace();
            }
        }
    }

    public static  void renameFiles(File directory){
        if(directory.isDirectory()){
            for(File oldFile: directory.listFiles()){
                File newFile = new File(oldFile.getParent() + "\\1_" + oldFile.getName());
            if(oldFile.renameTo(newFile)){
                System.out.println("RENAME: " + oldFile.getAbsolutePath() + "to" + newFile.getAbsolutePath());

            }
            else{
                System.out.println("Sorry! the file can´t be rename");
            }
            }
        }
    }
    public static void deleteFile(File directory){
        if(directory.isDirectory()){
            for(File file: directory.listFiles()){
                file.delete();
                System.out.println("DELETE: " + file.getAbsolutePath());
            }
        }
    }
}
