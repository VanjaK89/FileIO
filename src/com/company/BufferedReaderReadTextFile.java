package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderReadTextFile {

    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        int c;
        while((c = bufferedReader.read()) != -1) {
            char character = (char) c;
            System.out.println(c + "  " + character);
        }

        bufferedReader.close();
    }
}
