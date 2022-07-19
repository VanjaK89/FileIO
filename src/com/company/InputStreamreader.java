package com.company;

import java.io.*;

public class InputStreamreader {
    public static void main(String[] args) {
     File file = new File("test.txt");
        try {
            InputStream stream = new FileInputStream(file);
            Reader reader = new InputStreamReader(stream);
            int data = reader.read();
            while(data != -1){
                System.out.println(data);
                data = reader.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
