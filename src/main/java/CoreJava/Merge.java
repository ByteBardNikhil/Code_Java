package CoreJava;

import java.util.Arrays;

public class Merge {

    public static void mergeSort(int[] a) {
        int n = a.length;
        if(n<=1)
            return ;
    
      {
        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];

        System.arraycopy(a, 0, left, 0, mid);
        System.arraycopy(a, mid, right,0,n-mid);
        
        mergeSort(left);
        mergeSort(right);
        
        int i=0,j=0,k=0;
        while(i<left.length && j<right.length)
        {
            if(left[i]<right[j])
            {
                a[k]=left[i];
                i++;
            }
            else
            {
                a[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<left.length)
        {
            a[k++]=left[i++];
        }
        while(j<right.length)
        {
            a[k++]=right[j++];
        }
       
      }
    }

    public static void main(String[] args) {
        int[] a = {12, 11, 13, 5, 6, 7};
        mergeSort(a);
        System.out.println("Sorted Array : " + Arrays.toString(a));

    }

}
