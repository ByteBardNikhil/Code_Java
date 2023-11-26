/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LeetCode;

/**
 *
 * @author USER
 */
public class ProductExceptSelf {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};
        int n = nums.length;
        int p = 1;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            p = 1;
            for (int j = 0; j < n; j++) {
                if (j == i) {
                    continue;
                }else
                {
                p = p * nums[j];}
                
                

            }
            ans[i] = p;
        }

        for (int i : ans) {
            System.out.println(i);
        }
        
        
        
        int[] ans1=new int[n];
        int product=1;
        for(int i=0;i<n;i++)
        {
           /* 1 2 3 4*/
           
            
            
            
        }
        
    }
    
    /*
    1,2,3,4
    
    
    */
    
}
