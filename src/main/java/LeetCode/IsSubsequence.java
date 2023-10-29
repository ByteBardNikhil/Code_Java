
package LeetCode;


public class IsSubsequence {
    public static void main(String[] args) {
        
        String s="abcde";
        String t="aec";
        
        int i=0, j=0;
        int n=s.length();
        int m=t.length();
        /*
     i   a b c d e
     j   a c e    true;
         a e c    false
        */
        boolean flag = false;
        while(i<n && j<m)
        {
             if(s.charAt(i)==t.charAt(j))
             {
                 i++;
                 j++;
             }
             else
               i++;
        }
        if(i==n && j==m)
        {
            System.out.println("true");
        }
        else
            System.out.println(flag);
        
    }
    
}
