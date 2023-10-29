/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoreJava;

/**
 *
 * @author USER
 */
public class SuperTest {

    public static void main(String[] args) {
        Student s = new Student("Nikhil", 21, "EN20CS301272");
        s.display();
    }

}

class Person {

    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void display()
    {
        System.out.println(name);
        System.out.println(age);
    }
}

class Student extends Person {

    String id;

    public Student(String name, int age, String id) {
        super(name, age);
        this.id = id;
    }

    public void display() {
        super.display();
        System.out.println("Student Id : " + id);

    }
}
