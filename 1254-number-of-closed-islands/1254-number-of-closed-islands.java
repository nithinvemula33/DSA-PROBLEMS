class Solution {
    boolean x=false;
    void check(int g[][],int i,int j)
    {
        if(i<0||j<0||i>=g.length||j>=g[0].length){x=true;return;}
        if(g[i][j]==1) return;
        g[i][j]=1;
        check(g,i+1,j);
        check(g,i-1,j);
        check(g,i,j+1);
        check(g,i,j-1);
    }
    public int closedIsland(int[][] g) {
         int l=0;
       for(int i=0;i<g.length;i++)
       {
        for(int j=0;j<g[0].length;j++)
        {
            if(g[i][j]==0)
            {
                check(g,i,j);
               if(x==false) {l++;}
            }
            x=false;
        }
       } 
       return l;
    
    }
}