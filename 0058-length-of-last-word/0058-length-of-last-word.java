class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr=s.trim().split("//s+");
       String x=arr[0];
       int c=0;
       int i=arr[0].length()-1;
       while(i>=0&&x.charAt(i)!=' ')
       {
        c++;i--;
       }
       return c;
        
    }
}