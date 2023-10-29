/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoreJava;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 *
 * @author USER
 */
public class StackOperation {

    public static void main(String[] args) {
        Set<String> operators = new HashSet<>();
        operators.add("+");
        operators.add("-");
        operators.add("*");
        operators.add("/");

        String[] tokens = {"3", "4", "*", "5", "+"};
        Stack<String> s = new Stack<>();
        for (String t : tokens) {
            if (!operators.contains(t)) {
                s.push(t);
            } else {
                int a = Integer.valueOf(s.pop());
                int b = Integer.valueOf(s.pop());

                switch (t) {
                    case "+":
                        s.push(String.valueOf(a + b));
                        break;
                    case "-":
                        s.push(String.valueOf(a - b));
                        break;
                    case "*":
                        s.push(String.valueOf(a * b));
                        break;
                    case "/":
                        s.push(String.valueOf(a / b));
                        break;
                   
                        
                }
            }
        }
        System.out.println(s.pop());

    }
}
