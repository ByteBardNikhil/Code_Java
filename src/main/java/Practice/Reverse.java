/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practice;

/**
 *
 * @author USER
 */
public class Reverse {
    public static void main(String[] args) {
        int num=1234;
        int rev=0;
        while(num!=0)
        {
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
            
        }System.out.println("Reversed number : "+rev);
        
    }
    
}
