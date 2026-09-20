class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        int t=k;
        double sum=0;
        double x= Double.NEGATIVE_INFINITY;
        if(n==1) return (double)nums[0]/k;
        int i=0,j=0;
        while(i<n)
        {
            if(k>0)
            {
                sum+=nums[i];
                k--;
                i++;
            }
            else
            {
                
                if(i<n)
                {
                    sum=sum-nums[j];
                    sum+=nums[i];
                }
                i++;
                j++;
            }
            if(i>=t)
            {
            double c=sum/t;
             x = Math.max(x, c);
            }
        }
        return x;
    }
}