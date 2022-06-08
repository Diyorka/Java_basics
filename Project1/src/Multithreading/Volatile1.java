package Multithreading;

import java.util.Scanner;

public class Volatile1 {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        myThread1.start();

        Scanner sc = new Scanner(System.in);
        sc.nextLine();

        myThread1.shutdown();
    }
}

class MyThread1 extends Thread{
    private volatile boolean running = true; // переменные не кэшируются в памяти ядра, а читается из общей памяти

    public void run(){
        while(running){
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void shutdown(){
        this.running = false;
    }
}
