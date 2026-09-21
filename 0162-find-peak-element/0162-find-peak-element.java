class Solution {
    public int findPeakElement(int[] nums) {
       int n=nums.length;
       int i=0,x=-1,z=0;
       if(n==1) return 0;
       if(n==2)
       {
            if(nums[0]>nums[1])
            {
                return 0;
            }
            return 1;
       }
       while(i<n)
       {
        
        if(i-1>=0 &&i+1<n)
        {
            if(nums[i-1]<nums[i]&& nums[i]>nums[i+1])
            {
            z=i;
            if(z>x)
            {
                x=z;
            }
            }
        }
        else if(i-1<0 && nums[i]>nums[i+1])
        {
            z=i;
            if(z>x)
            {
                x=z;
            }
        } 
        
        else if(i+1>=n&&nums[i]>nums[i-1])
        {
            z=i;
            if(z>x)
            {
                x=z;
            }
        }
        
        i++;
       } return x;
    }
}