/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoreJava;

/**
 *
 * @author USER
 */
public class TestInheritance extends SuperClass{
    public static void main(String[] args) {
        SuperClass sc=new SuperClass();
        System.out.println(sc.publicVar);
        System.out.println(sc.privateVar);
        
    }
    
}
class Sample
{
    SuperClass sc=new SuperClass();
    public void display()
    {
        System.out.println(sc.privateVar);
    }
}
class SuperClass
{
    protected int privateVar=10;
    public int publicVar=20;
    private void display()
    {
        System.out.println("Display Method");
    }
     public void pubDisplay()
    {
        System.out.println("public Display Method");
    }
}

