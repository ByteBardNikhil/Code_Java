/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoreJava;

/**
 *
 * @author USER
 */
public class SynchronizedTest {

    public static void main(String[] args) {
        Shared s = new Shared();
        int count = 0;
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                s.increment(count);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                s.decrement(count);
            }
        });
        t1.start();
        t2.start();
        
        
        System.out.println("Value of Count : "+s.getCount());
    }
}

class Shared {

    private int count;

    public void increment(int count) {
        this.count = count;
        
        count++;
        
    }

    public void decrement(int count) {
        this.count = count;

        count--;
    }

    public int getCount() {
        return count;
    }

}
