package com.company.Threads.ThreadWithTimeAndStopTaster;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleHelper {
    public static String readLine() {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);


        try {
            return bf.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
