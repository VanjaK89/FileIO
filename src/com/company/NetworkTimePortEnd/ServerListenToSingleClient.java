package com.company.NetworkTimePortEnd;

import java.io.*;
import java.net.MalformedURLException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ServerListenToSingleClient {
    public static void main(String[] args) {
        //ich bin ein server, jemand redet mit mir, und ich rede zurück

        try {
            System.out.println("Warte auf eingehende verbindung");
            ServerSocket serverSocket = new ServerSocket(9090);
            Socket socket = serverSocket.accept();                //ich weisse ein serversocket die connesction zwischen server und user
            System.out.println("Client hat sich verbunden");
            //jemand hat sich verbundet, und wir möchten jemand begrüßen, wir müssen einen response hin schicken
            //wir brauchen ein Object für Stream object
            //output stream ist das was ich zum client schreibe
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            //immer flushen, weil sonst funcioniert nicht
            bufferedWriter.write("Hello");
            bufferedWriter.newLine();//ne koristim sout zato sto moram na comandprompt ispisati a ne na consolu
            bufferedWriter.flush();                                   //kad je na konzolu onda mogu koristiti sout
            //client sagt jetzt time, ich muss time ausgeben
            //zuerst muss ich befehl bearbeiten
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println("Client has sent: " + line);

                //drei comandos das ich verarbeiten möchte date, time
                if ("TIME".equals(line)) {
                    Date date = new Date();
                    bufferedWriter.write(date.toString());
                    bufferedWriter.newLine();   //obavezno new line napisati
                    bufferedWriter.flush();
                } else if ("PORT".equals(line)) {
                    bufferedWriter.write("remote port" + socket.getPort());
                    bufferedWriter.write("Port: " + socket.getLocalPort());
                    bufferedWriter.newLine();
                    bufferedWriter.flush();
                } else if ("END".equals(line)) {
                    bufferedWriter.write("Ende");
                    bufferedWriter.newLine();
                    bufferedWriter.flush();
                    break; //moramo izaci iz while schleife sa break inace ne mozemo drugacije izaci
                } else {
                    bufferedWriter.write("Unknown command");
                    bufferedWriter.newLine();
                    bufferedWriter.flush();
                }
            }
            bufferedWriter.close();
            bufferedReader.close();
            System.out.println("Server wurde beendet");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

