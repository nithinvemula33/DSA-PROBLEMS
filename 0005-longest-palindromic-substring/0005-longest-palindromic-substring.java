class Solution {
    static boolean check(String s)
    {
        int n=s.length();
        int i=0;
        int j=n-1;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            i++;j--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int n=s.length();
        String x="";
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<=n;j++)
            {
                String y=s.substring(i,j);
                if(check(y)&&y.length()>x.length())
                {
                    x=y;
                }
            }
        }
        return x;
    }
}