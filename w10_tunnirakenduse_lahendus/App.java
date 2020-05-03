package app;

public class App {
    public static void main(String[] args) throws Exception {
        MyThread myThread1 = new MyThread("Jagub kolmega", 1000);
        MyThread myThread2 = new MyThread("Ei jagu kolmega", 600);
        MyThread myThread3 = new MyThread("Pole 2", 500);
        myThread1.start();
        myThread2.start();
        myThread3.start();
    }
}