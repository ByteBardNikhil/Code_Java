/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoreJava;

/**
 *
 * @author USER
 */
public class MultipleTask {

    public static void main(String[] args) {
        Thread t1 = new Thread(new Task1());
        Thread t2 = new Thread(new Task2());
        Thread t3 = new Thread(new Task3());
        t1.start();
        t2.start();
        t3.start();

    }

}

class Task1 implements Runnable {

    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

class Task2 implements Runnable {

    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

class Task3 implements Runnable {

    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
