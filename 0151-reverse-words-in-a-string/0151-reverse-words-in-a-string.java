import java.util.*;
class Solution {
    public String reverseWords(String s) {
        String[] a=s.trim().split("\\s+");
        String x="";
        System.out.println(Arrays.toString(a));
        for(int i=a.length-1;i>=0;i--)
        {
            if(a[i]!=" ")
            {
                x+=a[i]+' ';
            }
            
        }
        x=x.substring(0,x.length()-1);
        return x;

    }
}