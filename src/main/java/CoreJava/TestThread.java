/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoreJava;

/**
 *
 * @author USER
 */
public class TestThread {

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.setName("First");
        t2.setName("Second");

        t1.start();
        t2.start();
        Thread t3 = new Thread(new MyRunnable());
        Thread t4 = new Thread(new MyRunnable());
        t3.setName("Third");t4.setName("Fourth");
        
        t3.start();
        t4.start();

    }
}

class MyThread extends Thread {

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Running : " + Thread.currentThread().getName());
        }
    }

}

class MyRunnable implements Runnable {

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
