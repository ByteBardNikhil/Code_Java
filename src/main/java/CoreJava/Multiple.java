/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoreJava;

/**
 *
 * @author USER
 */
public class Multiple {
    public static void main(String[] args) {
        C c=new C();
//        c.methodA();
//        c.methodB();
    }
}
interface A{void methodA();}
interface B{void methodB();}
class C implements A,B
{
    public void methodA(){System.out.println("Method A");}
    public void methodB(){System.out.println("Method B");}
    

}
