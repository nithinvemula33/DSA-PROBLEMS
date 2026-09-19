class Solution {
    public int maxDepth(String s) {
        int c=0,x=0;
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='(')
            {
                c++;
                if(c>x)
                {
                    x=c;
                }
                
            }
            else if(s.charAt(i)==')')
            {
                c--;
            }
            else continue;
        }
        return x;
    }
}