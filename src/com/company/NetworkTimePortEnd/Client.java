package com.company.NetworkTimePortEnd;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
        public static void main(String[] args) {

            try {
                Socket socket = new Socket("localhost", 1111);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                System.out.println("Server Antwort");
                System.out.println(bufferedReader.readLine());

                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                bufferedWriter.write("PORT");
                bufferedWriter.newLine();
                bufferedWriter.flush();
                System.out.println(bufferedReader.readLine());



            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


