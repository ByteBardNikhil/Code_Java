/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoreJava;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author USER
 */
public class ServerTest {
    public static void main(String[] args) {
        try{
        ServerSocket  serverSocket=new ServerSocket(12345);
        while(true)
        {
            Socket clientSocket=serverSocket.accept();
            System.out.println("Client Connection fron : "+clientSocket.getInetAddress());
        }
        }catch(IOException e){System.out.println(e);}
    }
}
