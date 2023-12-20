/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DynamicProgramming;

/**
 *
 * @author USER
 */
public class MatrixChainMulti {

    public static void main(String[] args) {

        int[] a = {40, 20, 30, 10, 30};
        int n = a.length;
        int i = 1, j = n - 1;
        System.out.println(solve(a, i, j));
    }

    private static int solve(int[] a, int i, int j) {
    int mn=Integer.MIN_VALUE;
    
    if(i>=j)
        return 0;
    else
    {
        for(int k=i;k<=j-1;k++)
        {
            int temp=solve(a,i,k)+solve(a,k+1,j)+a[i-1]*a[k]*a[j];
            mn=Math.max(temp, mn);
            
        }
        
    }
    
    return mn;
    }
}
