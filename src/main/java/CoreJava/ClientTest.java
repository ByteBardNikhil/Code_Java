/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoreJava;

import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author USER
 */
public class ClientTest {
    public static void main(String[] args) {
        try{
            Socket socket=new Socket("localhost",12345);
            
            System.out.println("Connected to the server");
        }catch(IOException e){System.out.println(e);}
    }
    
}
