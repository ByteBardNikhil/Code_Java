/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoreJava;

/**
 *
 * @author USER
 */
public class DiamondProblem {
    public static void main(String[] args) {
        System.out.println("Demonstration of Diamond Problem");
    }

}
//class A{}
//class B extends A{}
//class C extends A{}
//calss D extends B,C{} //this is an error as multiple inheritance is not possible
/*but through inteface we can achieve multiple inheritance 
and hence can achieven diamond problem*/
interface A {

    void doSomething();
}

class B implements A {

    public void doSomething() {
        System.out.println("Calss B");
    }
}

class C implements A {

    public void doSomething() {
        System.out.println("Calss C");
    }
}

class D extends B implements A {

    public void doSomething() {
        System.out.println("Calss D");
    }
}
