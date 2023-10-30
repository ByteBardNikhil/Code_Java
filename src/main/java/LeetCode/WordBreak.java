
package LeetCode;


public class WordBreak {
    public static void main(String[] args) {
        String s="applepen";
        String[] dic={"apple","pen"};
        check(s, dic);
        
    }
    private static boolean check(String s,String[] dic)
    {
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                String word=s.substring(i,j+1);
                System.out.println(word);
            }
        }
        return true;
    }
    
}
