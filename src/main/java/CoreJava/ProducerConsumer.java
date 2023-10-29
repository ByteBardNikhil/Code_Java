/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoreJava;

import java.nio.Buffer;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class ProducerConsumer {
    public static void main(String[] args) {
        BlockingQueue<Integer> buffer=new ArrayBlockingQueue<>(10);
        Thread ProducerThread=new Thread(new Producer(buffer));
        Thread ConsumerThread=new Thread(new Consumer(buffer));
        ProducerThread.start();
        ConsumerThread.start();
        
    }
}

class Producer implements Runnable {

    private BlockingQueue<Integer> buffer;

    public Producer(BlockingQueue<Integer> buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                buffer.put(i);

                System.out.println("Producer : " + i);
                new Sleep().sleep(4000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
}

class Consumer implements Runnable {

    private BlockingQueue<Integer> buffer;

    public Consumer(BlockingQueue<Integer> buffer) {
        this.buffer = buffer;
    }
   
    public void run() {
    
    try{
        for(int i=0;i<10;i++)
        {
            int item=buffer.take();
            System.out.println("consumed item : "+item);
            new Sleep().sleep(10);
            
        }
    }catch(InterruptedException e)
    {
        System.out.println(e);
    }
    }
}

class Sleep {

    public void sleep(int x) {
        try {
            Thread.sleep(x);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

}
