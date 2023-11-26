package CoreJava;

import java.util.Arrays;
import java.util.Stack;

public class NearestGreatorToRight {

    public static void main(String[] args) {
        int[] a = {1, 3, 2, 4};
        /*  3 4 4 -1 */
        int n = a.length;
        int[] ans = new int[n];
        Stack<Integer> s = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            if (s.isEmpty()) {
                ans[i] = -1;
            } else if (a[i] < s.peek()) {
                ans[i] = s.peek();
            } else if (a[i] >= s.peek()) {
                while (a[i] >= s.peek()) {
                    s.pop();
                }
                if (s.isEmpty()) {
                    ans[i] = -1;
                } else {
                    ans[i] = s.peek();
                }

            }
            s.push(a[i]);
        }
        System.out.println(Arrays.toString(ans));
    }

}
