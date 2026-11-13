class Solution {
    static void rev(int[] arr,int l, int h)
    {
        while(l<h)
        {
            int t=arr[l];
            arr[l]=arr[h];
            arr[h]=t;
            l++;
            h--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        rev(nums,0,n-1);
        rev(nums,0,k-1);
        rev(nums,k,n-1);

        
    }
}