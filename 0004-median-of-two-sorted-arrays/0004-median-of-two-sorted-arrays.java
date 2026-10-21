import java.util.*;
class Solution {
    static double find(int[] a,int[] b)
    {
        int n=a.length+b.length;
        double arr[]=new double[n];
        int x=a.length;
        int y=b.length;
        int z=(n/2)+1;
        int i=0,j=0,k=0;
        while(i<z&&j<x&&k<y)
        {
            if(a[j]<b[k])
            {
                arr[i++]=a[j++];
            }
           else
           {
            arr[i++]=b[k++];
           }
        }
        if(j>=x)
        {
            while(i<z&&k<y)
            {
                arr[i++]=b[k++];
            }
        }
        else if(k>=y)
        {
            while(i<z&&j<x)
            {
                arr[i++]=a[j++];
            }
        }
        double q=0;
        if(n%2==0)
        {
            q=(arr[z-1]+arr[z-2])/2;
            //System.out.println(arr[z-1]+" "+arr[z-2]+" "+q);

        }
        else
        {
            q=arr[z-1];
        }
        //System.out.println(Arrays.toString(arr));
        return q;

        
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        return find(nums1,nums2);
    }
}