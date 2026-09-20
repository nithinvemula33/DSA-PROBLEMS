class Solution {
    public int lengthOfLongestSubstring(String s) {
       int n=s.length();
       int x=0;
       
       for(int i=0;i<n;i++)
       {
        String z="";
        for(int j=i;j<n;j++)
        {
            String ch=""+s.charAt(j);
            if(z.contains(ch))
            {
                break;
            }
            z+=ch;
            if(x<z.length())
            {
                x=z.length();
            }
        } 
       } 
       return x;
    }
}