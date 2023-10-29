/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practice;

/**
 *
 * @author USER
 */
public class Shared {

    public static void main(String[] args) {
        final int[] shared = {5};
        Thread t1 = new Thread(new Runnable() {
            public void run() {
               System.out.println(shared[0]+"positive");
                shared[0]++;
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                
                System.out.println(shared[0]+"negative");

                shared[0]--;
            }
        });
        
        t1.start();
        t2.start();
        
        for(int i=0;i<10;i++)
        {}
        for(int i=0;i<100;i++)
        {}
        System.out.println(shared[0]+" After main");
        
        
        

    }

}
