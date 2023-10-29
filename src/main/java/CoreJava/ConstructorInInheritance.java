/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoreJava;

/**
 *
 * @author USER
 */
public class ConstructorInInheritance {

    public static void main(String[] args) {
        System.out.println("Main");
    }
}

class Person {

    String name,gender;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person(String name,int age,String gender)
    {
        this.name=name;
        this.age=age;
        this.gender=gender;
        
    }

    public void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);

    }

}

class Student extends Person {
String id;
    public Student(String name,int age,String id) {
        super(name, age);
        this.id=id;
        
    }
    
}
