/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practice;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class LeapYear {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter year");
        int y = s.nextInt();

        System.out.println(isLeapYear(y));
    }

    private static boolean isLeapYear(int y) {
        if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
            return true;
        }
        return false;
//1900 and 1300 are divisible 
//by 
    }

}
