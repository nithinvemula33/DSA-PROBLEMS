class Solution {
    public int[] sortArrayByParity(int[] arr) {
        int n=arr.length;
        int i=0;
        int j=n-1;
        while(i<j)
        {
            if(arr[i]%2!=0)
            {
                int t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
                j--;
            }
            else i++;
        }
        return arr;
    }
}