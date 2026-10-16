class Solution {
    public String longestCommonPrefix(String[] st) {
        int n=st.length;
        int x=201;
        for(int i=0;i<n;i++)
        {
            String s=st[i];
            if(x>st[i].length())
            {
                x=st[i].length();
            }
        }
        String s="";
        for(int i=0;i<x;i++)
        {
            for(int j=1;j<n;j++)
            {
                if(st[j-1].charAt(i)!=st[j].charAt(i))
                {
                    return s;
                }
            }
            s+=st[0].charAt(i);
        }
        return s;
        
    }
}