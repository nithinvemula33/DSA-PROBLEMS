class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int n=arr1.length;
        int m=arr2.length;
        int c=0,z=0;
        for(int i=0;i<n;i++)
        { 
            c=0;
            for(int j=0;j<m;j++)
            {
                int x=arr1[i]-arr2[j];
                if(x<0)x=-x;
                if(x>d)c++;
            }
            if(c==m)z++;
        }
        return z;
    }
}