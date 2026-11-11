class Solution {
        List<List<Integer>>ans=new ArrayList<>();
    void com(int[] arr,int i,int n,int k,ArrayList<Integer> lt)
    {
        if(i>=n)
        {
            if(lt.size()==k)
            {
                ans.add(new ArrayList<>(lt));
            }
            return;
        }
        lt.add(arr[i]);
        com(arr,i+1,n,k,lt);
        lt.remove(lt.size()-1);
        com(arr,i+1,n,k,lt);
    }
    public List<List<Integer>> combine(int n, int k) {
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=i+1;
        }
        com(arr,0,n,k,new ArrayList<>());
        return ans;
    }
}