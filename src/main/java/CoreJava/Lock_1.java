package CoreJava;

public class Lock_1 {

    public static void main(String[] args) {
        Processor p1 = new Processor();
        Processor p2 = new Processor();

        Thread t1 = new Thread(p1, "First");
        Thread t2 = new Thread(p2, "Second");
        Thread t3 = new Thread(new Processor(), "Third");

        t1.start();
        t2.start();
        t3.start();

    }

}

class Processor implements Runnable {

    public void run() {
        display();

    }

    public void display() {

        synchronized (this) {
            System.out.println("Object Lock started for Thread : " + Thread.currentThread().getName());

            for (int i = 0; i <= 5; i++) {
                System.out.println(" i : " + i + " In thread " + Thread.currentThread().getName());
            }
            System.out.println("Object Lock Ended for : " + Thread.currentThread().getName());
            System.out.println("");
        }
    }
}
