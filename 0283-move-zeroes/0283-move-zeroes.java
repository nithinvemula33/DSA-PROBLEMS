class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int i=0;
        int j=0;
        if(n==1) return;
        while(j<n)
        {
            if(nums[j]!=0)
            {
                int t=nums[i];
                nums[i]=nums[j];
                nums[j]=t;
                i++;
                j++;

            }
            else j++;
        }
    }
}