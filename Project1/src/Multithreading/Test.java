package Multithreading;

public class Test {
    public static void main(String[] args) throws InterruptedException {
//        MyThread myThread = new MyThread();
//        myThread.start();
//
//        MyThread myThread2 = new MyThread();
//        myThread2.start();

//        System.out.println("Going to sleep");
//        Thread.sleep(3000);
//        System.out.println("Awake");

        Thread thread = new Thread(new Runner());
        thread.start();

    }
}

class Runner implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i+ " Hello from myThread");
        }
    }
}

class MyThread extends  Thread{
    public void run(){
        for (int i = 0; i < 500; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i+ " Hello from myThread");
        }
    }
}
