class Solution {
    public int strStr(String s, String t) {

        if(s.contains(t))
        {
           s=s.replace(t,"1");
           for(int i=0;i<s.length();i++)
             {
                if(s.charAt(i)=='1')
                {return i;}
            }
        }
        return -1; 
        
    }
}