class Solution {
    static int search(int[] arr,int x)
    {
        int n=arr.length;
        int z=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==x)
            {
                z=i;
                break;
            }
        }
        return z;
    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums1.length;
        for(int i=0;i<n;i++)
        {
            int x=search(nums2,nums1[i]);
            int j=x+1;
            while(j<nums2.length)
            {
                if(nums2[x]<nums2[j])
                {
                    nums1[i]=nums2[j];
                    break;
                }
                j++;
            }
            if(j==nums2.length) nums1[i]=-1;
            
        }
        return nums1;
    }
}