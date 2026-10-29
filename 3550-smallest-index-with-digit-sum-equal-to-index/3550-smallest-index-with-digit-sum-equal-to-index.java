class Solution {
    static int check(int n)
    {
        int sum=0;
        while(n!=0)
        {
            sum+=n%10;
            n=n/10;
        }
        return sum;
    }
    public int smallestIndex(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            String s=""+nums[i];
            if(s.length()>1)
            {
                if(check(nums[i])==i)
                {
                    return i;
                }
            }
            else if(nums[i]==i)
            {
                return i;
            }
        }
        return -1;
    }
}