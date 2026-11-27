class Solution {
    public String reverseVowels(String s) {
      char arr[]=s.toCharArray();
      int i=0,j=s.length()-1;
      String x="aeiouAEIOU";
      while(i<j)
      {
        if(x.indexOf(arr[i])==-1){i++;continue;}
        if(x.indexOf(arr[j])==-1){j--;continue;}
        else
        {
        char t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
        i++;j--;
        }
      }  
      return new String(arr);
    }
}