class Solution {
    public int calPoints(String[] op) {
        Stack<Integer> st=new Stack<>();
        int n=op.length;
        for(int i=0;i<n;i++)
        {
            if(op[i].equals("C")) {
                st.pop();
            }
            
            else if(op[i].equals("+"))
            {
                int x=st.pop();
                int z=x+st.peek();
                st.push(x);
                st.push(z);
            }
            else if(op[i].equals("D"))
            {
                int x=st.peek()*2;
                st.push(x);
            }
            else 
            {
                st.push(Integer.parseInt(op[i]));
            }
        }
        int sum=0;
        for(int i:st)
        {
            sum+=i;
        }
        return sum;
    }
}