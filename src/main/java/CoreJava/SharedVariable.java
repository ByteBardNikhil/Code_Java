/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoreJava;

/**
 *
 * @author USER
 */
public class SharedVariable {

    public static void main(String[] args) {

        SharedVar sv = new SharedVar();
        Thread thread1 = new Thread(
                () -> {
                    for (int i = 0; i < 5; i++) {
                        sv.increment();
                        System.out.println("Thread1");
                    }
                });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                sv.increment();
                System.out.println("Thread 2");

            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Shared variable value : " + sv.getSharedVariable());

    }
}

class SharedVar {

    private volatile int sharedVariable = 0;

    public void increment() {
        sharedVariable++;
    }

    public int getSharedVariable() {
        return sharedVariable;
    }

}
