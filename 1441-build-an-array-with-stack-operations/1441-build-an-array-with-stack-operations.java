class Solution {
    public List<String> buildArray(int[] t, int n) {
        List<String> al=new Stack<>();
        int m=t.length;
        int i=0,j=1;
        while(i<m&&j<=n)
        {
            if(t[i]==j)
            {
                al.add("Push");
                i++;
            }
            else
            {
                al.add("Push");
                al.add("Pop");
            }
            j++;
        }
        return al;
    }
}