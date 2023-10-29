/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoreJava;

/**
 *
 * @author USER
 */
public class InterfaceTest {
    public static void main(String[] args) {
     Test t=new Test(){};
     t.display();
     Test.staticMethod();
    }
}
interface Test
{
    default void display()
    {
        System.out.println("This is Nikhil Mahajan");
    }
    static void staticMethod()
    {
        System.out.println("Static Method");
    }
}
interface Test2
{
    void show();
}
class Sample implements Test2
{
    public void show()
    {
        
    }
}
