class Solution {
    public String removeDuplicates(String s) {
       Stack<Character> st=new Stack<>();
       int n=s.length();
       for(int i=n-1;i>=0;i--)
       {
         char ch=s.charAt(i);
         if(st.size()==0)
         {
            st.push(ch);
         }
        else if(st.peek().equals(ch))
        {
            st.pop();
        }
        else 
        {
            st.push(ch);
        }
       } 
       String x="";
       while(st.size()!=0)
       {
         x=x+st.peek();
         st.pop();
       }

       return x;
    }
}