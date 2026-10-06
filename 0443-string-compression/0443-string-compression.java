class Solution {
    public int compress(char[] chars) {
        int n=chars.length;
        int i=0,j=0,c=0;
        String ans="";
        while(j<n)
        {
            if(chars[i]==chars[j])
            {
                c++;j++;
            }
            else
            {
                ans+=chars[i];
                if(c>1)
                {
                    ans+=c;
                }
                c=0;
                i=j;
            }
        }
        ans+=chars[i];
        if(c>1)
        {
            ans+=c;
        }
        j=0;
        for(i=0;i<ans.length();i++)
        {
            char ch=ans.charAt(j);
 
                chars[i]=ch;
                j++;

        }    
        return ans.length();   
                
    }
}