package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Temp {

    public static void main(String[] args) {
        int[] a = {1,3,2,4};

        int n = a.length;
        Stack<Integer> s = new Stack();
        List<Integer> ls = new ArrayList();
       /*
        1 3 2 4 
          i  
        stack = 4 
        ans   = -1
        */
        for(int i=n-1;i>=0;i--)
        {
            if(s.isEmpty())
                ls.add(-1);
            else if(a[i]<s.peek())
                ls.add(s.peek());
            else if(a[i]>s.peek())
            {
                while(a[i]>=s.peek())
                    s.pop();
                if(s.isEmpty())
                    ls.add(-1);
                else
                    ls.add(s.peek());
            }
                
         s.push(a[i]);
        }
        
        
        
        System.out.println(ls);

    }

}
