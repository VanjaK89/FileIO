package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class UE14BinaryOutput {
    public static void main(String[] args) {


        File file = new File("test-output.txt");

        {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                String output = "Hello File- first output";
                for (char c : output.toCharArray()) {
                    fileOutputStream.write(c);
                }
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}