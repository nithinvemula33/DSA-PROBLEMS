class Solution {
    void check(int[][] m,int i,int j,int sr,int c)
    {
        if(i<0||j<0||i>=m.length||j>=m[0].length)return;
        if(m[i][j]!=sr||m[i][j]==c)return;
        m[i][j]=c;
        check(m,i+1,j,sr,c);
        check(m,i,j+1,sr,c);
        check(m,i-1,j,sr,c);
        check(m,i,j-1,sr,c);
    }
    public int[][] floodFill(int[][] m, int sr, int sc, int c) {
        int x=m[sr][sc];
        check(m,sr,sc,x,c);
        return m;
    }
}