package com.company;

import java.io.*;

public class getCharactersWithInputStream {
    public static void main(String[] args) {

        File file = new File("products.txt");

        try {
            FileInputStream fileStream = new FileInputStream(file);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileStream);

            int count = 0;
            int binarniBroj;
            while((binarniBroj = bufferedInputStream.read()) != -1){
//                char[]character = Character.toChars(binarniBroj);
//                System.out.println(character);
                if(!Character.isWhitespace((char) binarniBroj)){
                    System.out.println((char) binarniBroj);
                    count++;
                }
            }
            System.out.println(count);
            bufferedInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
