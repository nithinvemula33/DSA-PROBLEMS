class Solution {
    static int rob(int nums[],int i,int memo[])
    {
        if(i>=nums.length)return 0;
        if(memo[i]!=-1)return memo[i];
        int pick=nums[i]+rob(nums,i+2,memo);
        int npick=rob(nums,i+1,memo);
        return memo[i]=Math.max(pick,npick);

    }
    public int rob(int[] nums) {
        int memo[]=new int [nums.length+1];
        Arrays.fill(memo,-1);
        return Math.max(rob(nums,0,memo),rob(nums,1,memo));
        
    }
}