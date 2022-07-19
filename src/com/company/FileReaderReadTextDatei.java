package com.company;

import java.io.*;

public class FileReaderReadTextDatei {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
       FileReader fileReader = new FileReader(file);
       int c;
       while((c = fileReader.read()) != -1) {
           char character = (char) c;
           System.out.println(c + "  " + character);
       }

       fileReader.close();
    }
}
