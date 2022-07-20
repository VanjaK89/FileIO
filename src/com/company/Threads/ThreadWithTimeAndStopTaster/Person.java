package com.company.Threads.ThreadWithTimeAndStopTaster;

import java.util.Date;

public class Person implements Runnable {
    final int sleepInterval = 1000;
    private boolean isRunning = true;
    private String name;

    public Person(String name) {
        this.name = name;
    }
    public void requestShutDown(){
        isRunning = false;
    }

    @Override
    public void run() {
        while (isRunning) {
            Date date = new Date();
            System.out.println(date.toString());
        }
        try {
            Thread.sleep(sleepInterval);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
