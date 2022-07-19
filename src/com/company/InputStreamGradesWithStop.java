package com.company;

import java.io.*;

public class InputStreamGradesWithStop {
    public static void main(String[] args) {
        File file = new File("grades.txt");
        try {
            FileWriter fileWriter = new FileWriter(file);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            System.out.println("Geben Sie Ihr Fach sowie Note ein: ");
            InputStreamReader stream = new InputStreamReader(System.in);
            BufferedReader bufferedReader = new BufferedReader(stream);

            String line;
            while(!(line = bufferedReader.readLine()).equals("STOP")){
                printWriter.println(line);
                System.out.println(line);
            }
            bufferedReader.close();

            printWriter.flush();
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
