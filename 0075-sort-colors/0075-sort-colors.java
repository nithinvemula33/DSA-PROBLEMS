class Solution {
    public void sortColors(int[] arr) {
        int n=arr.length;
        int a=0,b=0,c=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0) a++;
            if(arr[i]==1) b++;
            if(arr[i]==2) c++;   
        }
        for(int i=0;i<a;i++)
        {
            arr[i]=0;
        }
        int x=a+b;
        for(int i=a;i<x;i++)
        {
            arr[i]=1;
        }
        int y=x+c;
        for(int i=x;i<y;i++)
        {
            arr[i]=2;
        }
    }
}