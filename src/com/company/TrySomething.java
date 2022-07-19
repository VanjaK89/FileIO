package com.company;

import java.io.*;

public class TrySomething {
    public static void main(String[] args) throws IOException {
        File file4 = new File("C:\\Users\\s51637\\Desktop\\texten.txt");
        if (file4.createNewFile()) {
            System.out.println(file4.getAbsolutePath() + "FileName" + file4.getName());

        } else {
            System.out.println("File already exists");
            FileWriter fileWriter = new FileWriter(file4);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String line= "I am trying to undestand Buffered Writer and FileWriter";
            bufferedWriter.write(line);
            bufferedWriter.flush();
            bufferedWriter.close();
        }
        FileReader fileReader = new FileReader(file4);
        BufferedReader bf = new BufferedReader(fileReader);
        String line;
        while((line = bf.readLine()) != null){
            System.out.println(line);
        }




    }
}
