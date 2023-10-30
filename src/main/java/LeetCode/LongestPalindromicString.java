/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LeetCode;

/**
 *
 * @author USER
 */
public class LongestPalindromicString {

    public static void main(String[] args) {
        String s = "babad";
        int n = s.length() - 1;
        int LongestLen = 0;
        String LongestPalin = null;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int len = j - i;
                String curr = s.substring(i, j + 1);
                if (len > LongestLen) {
                    if (isPalin(curr)) {

                        Math.max(len, LongestLen);
                        LongestPalin = curr;

                    }
                }
            }
        }
        System.out.println("String : " + LongestPalin);
    }

    private static boolean isPalin(String s) {
        int n = s.length() - 1;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != s.charAt(n - i)) {
                return false;
            }
        }
        return true;
    }
}
