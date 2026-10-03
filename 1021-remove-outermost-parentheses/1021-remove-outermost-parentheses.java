class Solution {
    public String removeOuterParentheses(String s) {
        int n=s.length();
        int cc=0,oc=0,j=0;
        String x="";
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='(')
            {
                oc++;
            }
            if(s.charAt(i)==')')
            {
                cc++;
            }
            if(oc==cc)
            {
                x+=s.substring(j+1,i);
                j=i+1;
            }
        }
        return x;
    }
}