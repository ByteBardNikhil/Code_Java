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
public class ReverseString {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter String to be Reversed");
        String str=s.nextLine();
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        System.out.println("Reversed : "+rev );
    }
}
