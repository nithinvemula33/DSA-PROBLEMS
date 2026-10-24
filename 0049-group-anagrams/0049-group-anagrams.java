class Solution {
    static boolean check(String s,String t)
    {
        int[] arr=new int[26];
        if(s.length()!=t.length())return false;
        for(int i=0;i<s.length();i++)
        {
            arr[s.charAt(i)-'a']++;
            arr[t.charAt(i)-'a']--;
        }
        for(int i:arr)
        {
            if(i!=0)return false;
        }
        return true;
    }
    public List<List<String>> groupAnagrams(String[] arr) {
        List<List<String>>ans=new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            if(arr[i]=="-")continue;
            List<String>lt=new ArrayList<>();
            lt.add(arr[i]);
            for(int j=i+1;j<n;j++){
                if(arr[j]=="-")continue;
            if(check(arr[i],arr[j]))
            {
                lt.add(arr[j]);
                arr[j]="-";
            }}
            ans.add(lt);
        }
        return ans;
    }
}