package com.company;

import java.io.*;

public class InputStreamMItSTOP {
    public static void main(String[] args) throws IOException {
      InputStreamReader inputStreamReader = new InputStreamReader(System.in);

      BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
      String line;
      while(!(line = bufferedReader.readLine()).equals("Stop")){
          System.out.println(line);
      }
      bufferedReader.close();
        System.out.println("closed");
    }
}
