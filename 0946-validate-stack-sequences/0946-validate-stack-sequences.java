class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int n=pushed.length;
        Stack<Integer> st=new Stack<>();
        int j=0;
        int i=0;
        st.push(pushed[i++]);
       while(i<n) 
       {
        if(!st.isEmpty()&&st.peek()==popped[j])
        {
            st.pop();
            j++;

        }
        else
        {
            st.push(pushed[i]);
            i++;
        }
       }
        while(j<n)
        {
            if(st.peek()==popped[j])
            {
                st.pop();
                j++;
            }
            else break;
        }
       return st.isEmpty();
    }
}