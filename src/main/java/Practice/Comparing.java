/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practice;

/**
 *
 * @author USER
 */
public class Comparing {

    public static void main(String[] args) {

        String s1 = "Nikhil";
        String s2 = "nikhil";
        System.out.println("equals method : " + s1.equals(s2));
        System.out.println("equalsIgnoreCase method : " + s1.equalsIgnoreCase(s2));
        System.out.println("check string is empty  with equals method : " + s1.equals(""));
       
        
        String s3="aerad";
        String s4="Abcd";
        
        System.out.println("compareTo : "+s3.compareTo(s4));
        System.out.println("compareTo : "+s3.compareTo(s3));
        System.out.println("compareToIgnoreCase : "+s3.compareToIgnoreCase(s4));
        
        //through compareTo metho we can find the length of the String 
        
        String s="Nikhil";
        System.out.println("Length of String is "+s.compareTo(""));
        
    }

}
