class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
      int n=nums.length;
      int x=0,c=0;
      for(int i=0;i<n;i++)
      {
        
        if(nums[i]==1)
        {
            c++;
            if(x<c)
        {
            x=c;
        }
        }
        
        else
        {
            c=0;
        }

      }
      return x;
    }
}