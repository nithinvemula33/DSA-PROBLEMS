class Solution {
    public int[] plusOne(int[] d) {
        int j=d.length-1;
        while(j>=0)
        {
            d[j]+=1;
            if(d[j]<=9)
            {
                return d;
            }
            if(d[j]>9)
            {
                d[j]=0;
            }j--;
            
        }
            int arr[]=new int [d.length+1];
            arr[0]=1;
            return arr;
    }
}