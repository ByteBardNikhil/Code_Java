/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoreJava;

/**
 *
 * @author USER
 */
public class CharToString {

    public static void main(String[] args) {
        /*
        CharSequence is an interface
        String is a class - it has methods
        public final class String
        why final 
        the parent class of String is Object 
        String is a sequence of Chararter 
        it implements CharSequence,Serializable and Comparable
        
        public final class String extends Object implements CharSequence,Serializable,Comparable
        String is a immutable object
        
        
        There are total 3 classes to create String 
        1] String  --> 2 ways
        2] StringBuilder
        3] StringBuffer
        
        String is an immutable object
        
        Whenever any object is created 
        
        */
        char[] c = {'a', 'b', 'c', 'e'};
        for(char a:c)
            System.out.print(a+" ");
        String s = new String(c);
        System.out.println(s);
       
    }

}
