/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practice;

/**
 *
 * @author USER
 */
public class InterfaceTest{
    public static void main(String[] args) {
      MyFunctionalInterface myFunction=(message)->System.out.println(message); 
               myFunction.peroformAction("Hello World");
    }

   
    
}

interface MyFunctionalInterface
{
    void peroformAction(String message);
}
