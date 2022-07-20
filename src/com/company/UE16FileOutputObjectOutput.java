package com.company;

import java.io.*;

public class UE16FileOutputObjectOutput {
    public static void main(String[] args) {


        String s = "Hello World";
        byte[] b = {'e','x', 'a', 'm', 'p', 'l', 'e'};
        File file = new File("object.dat");
        FileOutputStream fileOutputStream;

        {
            try {
                fileOutputStream = new FileOutputStream(file);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

                objectOutputStream.writeObject(s);
                objectOutputStream.writeObject(b);
                objectOutputStream.flush();
                objectOutputStream.close();

                FileInputStream fileInputStream = new FileInputStream(file);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

                System.out.println("String: " + (String) objectInputStream.readObject());
                byte[] text2 = (byte[]) objectInputStream.readObject();
                String s2 = new String(text2);
                System.out.println("Byte[]: " + s2);

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

    }
}