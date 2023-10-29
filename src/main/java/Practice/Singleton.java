/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practice;

/**
 *
 * @author USER
 */
public class Singleton {

    public static void main(String[] args) {
        SingletonTest t1 = SingletonTest.getInstance();
        SingletonTest t2 = SingletonTest.getInstance();
    
    if(t1==t2)
            System.out.println("Same");
    else
            System.out.println("Different");
    }
}

class SingletonTest {

    private static SingletonTest instance;

    private SingletonTest()
    {}

    public static SingletonTest getInstance() {
        if (instance == null) {
            instance = new SingletonTest();
        }
        return instance;
    }

    
}
