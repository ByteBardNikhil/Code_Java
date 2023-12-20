/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoreJava;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author USER
 */
public class SetOperations {
    public static void main(String[] args) {
        Set<Integer> set1=new HashSet(Arrays.asList(1,2,3));
        Set<Integer> set2=new HashSet(Arrays.asList(3,4,5));
        
        Set<Integer> union=new HashSet(set1);
        union.addAll(set2);
        Set<Integer> intersection =new HashSet(set1);
        intersection.retainAll(set2);
        
        Set<Integer> difference =new HashSet(set1);
        difference.removeAll(set2);
        System.out.println(union);
        System.out.println(intersection);
        System.out.println(difference);
        
    }
}
