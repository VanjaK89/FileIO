package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class UE15BinaryFileOutputStream {
    public static void main(String[] args) throws IOException {
        File file = new File("teeest.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);

        char c;
        while ((c = (char) System.in.read()) != 'x') {
            fileOutputStream.write(c);
            System.out.println(c);
        }
        fileOutputStream.flush();
        fileOutputStream.close();
        System.out.println("Closed");
    }



    }

