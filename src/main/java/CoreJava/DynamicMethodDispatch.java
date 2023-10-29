/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoreJava;

/**
 *
 * @author USER
 */
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        First f=new First();
        f.show();
       
        
      
    }
}

class First {

    public void show() {
        System.out.println(this.getClass().getName());

    }
     public void display()
    {
        System.out.println("Display method");
    }
    
   
}

class Second extends First {

    public void show() {
        System.out.println(this.getClass().getName());

    }
    
}
