class Solution {
    int a=0;
    void check(int[][] g,int i,int j)
    {
        if(i<0||j<0||j>=g[0].length||i>=g.length)return;
        if(g[i][j]==0)return;
        g[i][j]=0;
        a++;
        check(g,i+1,j);
        check(g,i-1,j);
        check(g,i,j+1);
        check(g,i,j-1);
    }
    public int maxAreaOfIsland(int[][] g) {
        int ans=0;
        for(int i=0;i<g.length;i++)
        {
            for(int j=0;j<g[0].length;j++)
            {
                if(g[i][j]==1)
                {
                    
                    check(g,i,j);
                    System.out.println(a);
                    ans=Math.max(a,ans);
                    a=0;
                }
            }

        }
        return ans;
    }
}