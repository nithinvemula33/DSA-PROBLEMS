class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n=nums.length;
        if(n==1)return n;
        int p=1,m=1,pc=0,mc=0;
        for(int i=1;i<n;i++)
        {
            int x=nums[i-1];
            if(x>nums[i])
            {
                m++;
                p=1;
            }
            else if(x<nums[i])
            {
                p++;
                m=1;
            }
            else if(x==nums[i])
            {
                p=1;m=1;
            }
            if(p>pc)pc=p;
            if(m>mc)mc=m;
            // System.out.println(pc+" "+mc);
        }
        if(pc>mc)return pc;
        else if(mc>pc)return mc;
        else return mc;

    }
}