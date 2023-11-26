/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practice;

import java.sql.Array;
import java.util.Arrays;

/**
 *
 * @author USER
 */
public class SecondLargest {

    public static void main(String[] args) {

        int[] a = {10, 22, 34, 89, 90, 32};
        int largest=a[0],sL=Integer.MIN_VALUE;
        int n=a.length;
        for(int i=1;i<n;i++)
        {
            if(a[i]>largest)
                largest=a[i];
                       
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]>sL && a[i]!=largest)
                sL=a[i];
        }
        System.out.println("Second Largest : "+ sL);
    }

}
