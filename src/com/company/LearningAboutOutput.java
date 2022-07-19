package com.company;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

public class LearningAboutOutput {

    public static void main(String[] args) {
        try {
            FileOutputStream file = new FileOutputStream("test.txt");
            OutputStreamWriter output1 = new OutputStreamWriter(file);
            OutputStreamWriter output2 = new OutputStreamWriter(file, Charset.forName("UTF8"));
            System.out.println(output1.getEncoding());
            System.out.println(output2.getEncoding());

            output1.close();
            output2.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

