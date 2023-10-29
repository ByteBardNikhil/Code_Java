/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoreJava;

/**
 *
 * @author USER
 */
public class RotateArray {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7};
        int k=3;
        int n=a.length;
       int[] r=new int[n];
       for(int i=0;i<n;i++)
       {
           r[(i+k)%n]=a[i];
       }
        for(int i:r)
            System.out.print(i);
    }
    
            
    
}
