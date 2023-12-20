package CoreJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class NearestGreatorToRight {

    public static void main(String[] args) {
        int[] a = {100, 80, 60, 70, 60, 75, 85};
        /*1 1 1 2 1 4 6 */
        stockSpan(a);
        stockSpanOp(a);
    }

    private static void stockSpanOp(int[] a) {
        Stack<Pair> s = new Stack();
        List<Pair> ls = new ArrayList<>();
        int n = a.length;
        for (int i = 0; i < n; i++) {
        if(s.isEmpty())
            s.push(new Pair(-1,-1));
        else
         if(!s.isEmpty() && s.peek().first()>a[i])
             ls.add(new Pair(a[i],i));
            
        }

    }

    private static void stockSpan(int[] a) {
        int n = a.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i - 1; j >= 0; j--) {
                if (a[i] < a[j]) {
                    break;
                } else {
                    count++;
                }

            }
            ans[i] = count;
        }
        System.out.println(Arrays.toString(ans));
    }

}

class Pair {

    private int first;
    private int second;

    public Pair(int a, int b) {
        this.first = a;
        this.second = b;

    }

    public int first() {
        return first;
    }

    public int second() {
        return second;
    }

    public void setFirst(int f) {
        this.first = f;
    }

    public void serSecond(int s) {
        this.second = s;
    }

}
