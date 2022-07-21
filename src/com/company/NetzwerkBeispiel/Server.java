package com.company.NetzwerkBeispiel;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class Server {
    public static void main(String[] args) {

        System.out.println("Warte auf eine verbindung");
        try {

            ServerSocket serverSocket = new ServerSocket(9090);
            Socket socket = serverSocket.accept();
            System.out.println("Client hat sich verbundet");
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bufferedWriter.write("Hello");
            bufferedWriter.newLine();
            bufferedWriter.flush();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            int rounds = new Random().nextInt(10);
            for (int i = 0; i < rounds; i++){
                String line = bufferedReader.readLine();
                System.out.println("Client has sent: " + line);
                if ("ping".equals(line)) {
                    bufferedWriter.write("pong");
                    bufferedWriter.newLine();
                    bufferedWriter.flush();
                    System.out.println("Server responds: pong");
                } else if ("stop".equals(line)) {
                    System.out.println("The program ended");
                    System.out.println("The server connection ended");
                }

            }

            bufferedWriter.close();
            bufferedReader.close();
            System.out.println("The connection ended");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
