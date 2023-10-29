/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoreJava;

import jdk.jshell.spi.ExecutionControl;

/**
 *
 * @author USER
 */
public class PingPong {

    public static void main(String[] args) {

        Thread ping = new Thread(new Ping());
        Thread pong = new Thread(new Pong());
        ping.start();
        pong.start();

    }

}

class Ping implements Runnable {

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Ping");
            new Sleep().sleep();
        }
    }
}

class Pong implements Runnable {

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Pong");
            new Sleep().sleep();
        }
    }
}

class Sleep {

    public void sleep() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
