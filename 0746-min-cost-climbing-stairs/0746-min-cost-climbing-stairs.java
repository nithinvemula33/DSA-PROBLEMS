class Solution {
    static int fun(int arr[],int i,int memo[])
    {
        if(i>=arr.length)return 0;
        if(memo[i]!=-1)return memo[i];
        memo[i]=arr[i]+Math.min(fun(arr,i+1,memo),fun(arr,i+2,memo));
        return memo[i];
    }
    public int minCostClimbingStairs(int[] arr) {
        int memo[]=new int[arr.length];
        Arrays.fill(memo,-1);
        return Math.min(fun(arr,0,memo),fun(arr,1,memo));
        
    }
}