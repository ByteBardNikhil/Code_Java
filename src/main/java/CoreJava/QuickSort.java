package CoreJava;

public class QuickSort {

    public static void main(String[] args) {
        Quick q = new Quick();
        int[] a = {5, 4, 3, 2, 1};
        q.quick(a, 0, a.length - 1);
        for (int i : a) {
            System.out.print(i+" ");
        }
    }

}

class Quick {

    public void quick(int[] a, int low, int high) {
        if (low < high) {
            int p = partition(a, low, high);
            quick(a, low, p - 1);
            quick(a, p + 1, high);

        }
    }

    private int partition(int a[], int low, int high) {
        int pivot = a[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
           if(a[j]<=pivot)
           {
               i++;
               int temp=a[i];
               a[i]=a[j];
               a[j]=temp;
           }
        }
        int temp = a[i + 1];
        a[i + 1] = a[high];
        a[high] = temp;

        return i + 1;

    }
}
