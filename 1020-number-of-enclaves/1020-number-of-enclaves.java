class Solution {
    boolean t=false;
    int c=0;
    void check(int i,int j,int[][] g)
    {
        if(i<0||j<0||i>=g.length||j>=g[0].length)
        {
            t=true;
            return;
        }
        if(g[i][j]==0)return;
        else c++;
        g[i][j]=0;
        check(i+1,j,g);
        check(i,j+1,g);
        check(i-1,j,g);
        check(i,j-1,g);
    }
    public int numEnclaves(int[][] g) {
       int x=0;
       for(int i=0;i<g.length;i++)
       {
            for(int j=0;j<g[0].length;j++)
            {
                if(g[i][j]==1)
                {
                    check(i,j,g);
                    if(t==false){x+=c;}
                }
                 t=false;
                 c=0;
            }
           
       } 
       return x;
    }
}