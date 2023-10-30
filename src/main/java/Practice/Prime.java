/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practice;

/**
 *
 * @author USER
 */
public class Prime {

    public static void main(String[] args) {
        int n = 12;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("Number is Not Prime");
                break;
            }
        }
        System.out.println("Number is Prime");
    }

}
