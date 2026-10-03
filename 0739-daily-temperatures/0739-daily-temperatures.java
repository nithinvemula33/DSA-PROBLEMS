class Solution {
    public int[] dailyTemperatures(int[] t) {
        Stack<Integer>st=new Stack<>();
        
        int n=t.length;
        int[] arr=new int[n];
        int i=n-1;
        int c=1;
        while(i>=0)
        {
            if(st.isEmpty())
            {
                st.push(i);
                arr[i]=0;                
                i--;
            }
            //System.out.println(t[st.peek()]);
            if(i>=0&&t[st.peek()]>t[i])
            {
                arr[i]=st.peek()-i;
                st.push(i);
                i--;
            }
            else st.pop();
        }
        return arr;
    }
}