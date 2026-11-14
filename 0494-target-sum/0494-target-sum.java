class Solution {
    int c=0;
    void check(int[] arr,int t ,int s,int i)
    {
        if(i>=arr.length)
        {
            if(s==t)
            {
                c++;
            }return;
        }
        check(arr,t,s+arr[i],i+1);
        check(arr,t,s-arr[i],i+1);
    }
    public int findTargetSumWays(int[] nums, int t) {

        check(nums,t,0,0);
        return c;
    }
}