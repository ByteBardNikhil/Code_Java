/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoreJava;

/**
 *
 * @author USER
 */
public class ForwardBackward {
    public static void main(String[] args) {
        String s="JAVA";
        
        String forward=s.substring(1)+s.charAt(0);
        System.out.println(forward);
        
        String backward=s.charAt(s.length()-1)+ s.substring(0, s.length()-1);
        System.out.println(backward);
    }
    
}
