class Solution {
    public int minimumSwaps(int[] nums) {
        int n=nums.length;
        int i=0;
        int j=n-1;
        int c=0;
        while(i<j)
        {
            if(nums[i]==0)
            {
                if(nums[j]!=0)
                {int t=nums[i];
                nums[i]=nums[j];
                nums[j]=t;
                c++;}
                j--;
            }
            else i++;
        }
        return c;
    }
}