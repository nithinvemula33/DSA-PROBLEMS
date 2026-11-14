class Solution {
    public int countSquares(int[][] m) {
        if(m.length==1){if(m[0][0]==1)return 1;
        else return 0;}
      for(int i=1;i<m.length;i++)
      {
        for(int j=1;j<m[0].length;j++)
        {
            if(m[i][j]==1)
            {
                if(i-1<0||j-1<0)continue;
                m[i][j]+=Math.min(m[i-1][j],Math.min(m[i-1][j-1],m[i][j-1]));
            }
        }
      }  
      int sum=0;
      for(int i=0;i<m.length;i++)
      {
        for(int j=0;j<m[0].length;j++)
        {
            sum+=m[i][j];
        }
      } 
      return sum;
    }
}