/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoreJava;

/**
 *
 * @author USER
 */
public class Diamond2 {
    public static void main(String[] args) {
      
    }
  
}
interface A{void method();}
interface B extends A{void method();}
interface C extends A{void method();}
class D implements B,C
{
    public void method(){System.out.println("Method");}
}



