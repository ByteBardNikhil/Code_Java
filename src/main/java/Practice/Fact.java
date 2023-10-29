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
public class Fact {
 
    public static void main(String[] args) {
        System.out.println("Enter Number : ");
        int n=new Scanner(System.in).nextInt();
        System.out.println("Factorial : "+fact(n));;
    }
    private static int fact(int n)
    {
        if(n==0)
            return 1;
        
        return n*fact(n-1);
    }
}
