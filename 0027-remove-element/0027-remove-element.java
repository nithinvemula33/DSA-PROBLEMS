class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==val)
            {
                nums[i]=-1;
                c++;
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[i]==-1)
                {
                    int t=nums[i];
                    nums[i]=nums[j];
                    nums[j]=t;
                }
            }
        }
        return n-c;
    }
}