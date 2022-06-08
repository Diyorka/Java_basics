package Multithreading;

public class Deadlock1 {
    public static void main(String[] args) throws InterruptedException {
        Runner1 runner = new Runner1();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                runner.firstThread();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                runner.secondThread();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

    }
}
class Runner1 {
    public void firstThread(){

    }
    public void secondThread(){

    }
    public void finishThread(){

    }
}
