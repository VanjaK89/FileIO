package com.company.Threads.ThreadWithTimeAndStopTaster;

public class DemoMain {
    public static void main(String[] args) {
        Person p1 = new Person("Max");

        Thread t1 = new Thread(p1);

        t1.start();

        System.out.println("Drücken Sie eine Taste bzw. Eingabe um zu stoppen ...");

        if(ConsoleHelper.readLine() != null){
            p1.requestShutDown();
        }
        try{
            t1.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Fertig!");
    }
}
