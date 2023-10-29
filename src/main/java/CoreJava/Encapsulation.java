/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoreJava;

/**
 *
 * @author USER
 */
public class Encapsulation {
    public static void main(String[] args) {
    
        Employee e=new Employee();
        System.out.println(e.getEmpId());
    }
    
}
class Employee
{
    private int empid=20;
    public int getEmpId()
    {
        return empid;
    }
            
    
}
