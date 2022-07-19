package com.company;

import java.io.*;

public class BinaryInputStream {
    public static void main(String[] args) {
      File file = new File("products.txt");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            int byteReader;
            while((byteReader = bufferedInputStream.read()) != -1){
                char[] character = Character.toChars(byteReader);
                System.out.println(character);
            }
            bufferedInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
