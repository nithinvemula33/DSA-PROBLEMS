class Solution {
    public List<Integer> spiralOrder(int[][] m) {
        ArrayList<Integer>lt=new ArrayList<>();
        int l=0,t=0,b=m.length-1,r=m[0].length-1;
        while(l<=r&&t<=b)
        {
            for(int i=l;i<=r;i++)
            {
                lt.add(m[t][i]);
            }
            t++;
            for(int i=t;i<=b;i++)
            {
                lt.add(m[i][r]);
            }
            r--;
            if(t<=b)
            {
                for(int i=r;i>=l;i--)
                {
                    lt.add(m[b][i]);
                }
                b--;
            }
            if(l<=r)
            {
                for(int i=b;i>=t;i--)
                {
                    lt.add(m[i][l]);
                }
                l++;
            }
        }
        return lt;
    }
}