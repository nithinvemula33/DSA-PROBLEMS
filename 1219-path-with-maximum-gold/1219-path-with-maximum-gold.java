class Solution {
    int max=0;
    void check(int i,int j,int s,int[][] g)
    {
        if(i<0||j<0||i>=g.length||j>=g[0].length)return;
        if(g[i][j]==0)return;
        s+=g[i][j];
        max=Math.max(max,s);
        int t=g[i][j];
        g[i][j]=0;
        check(i+1,j,s,g);
        check(i,j+1,s,g);
        check(i-1,j,s,g);
        check(i,j-1,s,g);
        g[i][j]=t;
    }
    public int getMaximumGold(int[][] g) {
        for(int i=0;i<g.length;i++)
        {
            for(int j=0;j<g[0].length;j++)
            {
                if(g[i][j]!=0)
                {
                    check(i,j,0,g);
                }
            }
        }
        return max;
    }
}