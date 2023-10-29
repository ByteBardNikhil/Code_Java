/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoreJava;

/**
 *
 * @author USER
 */
class SuperClass {

    public int x;

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

}

class SubClass extends SuperClass {

    public double y;

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }
}

public class SingleInTest {

    public static void main(String[] args) {
        SubClass s = new SubClass();
        s.setX(203);
        s.setY(300.90);
        System.out.println(" x : " + s.x);
        System.out.println(" x : " + s.y);

    }
}
