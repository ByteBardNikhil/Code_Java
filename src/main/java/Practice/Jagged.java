/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practice;

/**
 *
 * @author USER
 */
/*
Jagged array are known as arrays of arrays.Unlike 2 dimensional array
jagged array allow different length of rows to be stored in the 
array
 */
public class Jagged {

    public static void main(String[] args) {
        int[][] jaggedArray = new int[3][];

        jaggedArray[0] = new int[]{1, 2, 3};
        jaggedArray[1] = new int[]{1, 2};
        jaggedArray[2] = new int[]{1, 2, 3,6};
        
        for(int i=0;i<jaggedArray.length;i++)
        {
            for(int j=0;j<jaggedArray[i].length;j++)
            {
                System.out.print(jaggedArray[i][j]+" ");
            }
            System.out.println("");
        }

    }
}
