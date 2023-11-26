/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practice;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author USER
 */
public class HashMapTest {

    public static void main(String[] args) {
        Map<String, Integer> score = new HashMap<>();

        score.put("Nikhil", 95);
        score.put("Ram", 89);
        score.put("Shyam", 23);
        
        int nikhilScore=score.get("Nikhil");
        System.out.println(nikhilScore);
        
        System.out.println(score.containsKey("Ram"));
        
        score.remove("Ram");
        
        System.out.println(score.containsKey("Ram"));

    }

}
