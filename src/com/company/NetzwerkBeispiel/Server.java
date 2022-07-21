package com.company.NetzwerkBeispiel;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

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
            String line;
            while((line = bufferedReader.readLine()) != null){
            System.out.println("Client has sent: " +  line);
                if("pong".equals(line)){
                    bufferedWriter.write("ping");
                    bufferedWriter.newLine();
                    bufferedWriter.flush();
                    System.out.printf("Server responds: ping");
                }
               else if("stop".equals(line)){
                    System.out.println("The program ended");
                    System.out.println("The server connection ended");
                }

            }

            bufferedWriter.close();
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
