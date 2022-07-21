package com.company.NetzwerkBeispiel;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class AnotherClient {
    public static void main(String[] args) {

        try {
            Socket socket = new Socket("localhost", 9090);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println("Server Antwort");
            System.out.println(bufferedReader.readLine());
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            Scanner sc = new Scanner(System.in);
            String command = sc.next();
            bufferedWriter.write(command);
            bufferedWriter.newLine();
            bufferedWriter.flush();
            System.out.println(bufferedReader.readLine());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}