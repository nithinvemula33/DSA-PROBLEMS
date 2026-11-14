class Solution {
    public int[] findDegrees(int[][] m) {
        int[] arr=new int[m.length];
        for(int i=0;i<m.length;i++)
        {
            for(int j=0;j<m.length;j++)
            {
                if(m[i][j]==1)
                {
                    arr[j]++;
                }
            }
        }
        return arr;
    }
}