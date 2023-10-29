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
public class MatrixMultiplication {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] m1 = {{1, 2}, {2, 1}};
        int[][] m2 = {{1, 2}, {2, 1}};
        int[][] ans = new int[m1.length][m2[0].length];

        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m2[0].length; j++) {
                for (int k = 0; k < m1[0].length; k++) {
                    ans[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        for (int[] row : ans) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

    }
}
