package com.company;

import java.io.*;

public class FileWriterPrintWriter {
    public static void main(String[] args) {

        try {
            FileWriter fileWriter = new FileWriter("file.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String data = "Das ist ein text";
            bufferedWriter.write(data);
            bufferedWriter.newLine();
            bufferedWriter.write(data);
            bufferedWriter.newLine();
            bufferedWriter.write(data);
            bufferedWriter.flush();
            bufferedWriter.close();
            System.out.println("Fertig");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
