class Solution {
    List<List<Integer>>ans=new ArrayList<>();
    void ss(int[] arr,List<Integer> lt,int i)
    {
        if(i>=arr.length){ans.add(new ArrayList<>(lt));return;}
        lt.add(arr[i]);
        ss(arr,lt,i+1);
        lt.remove(lt.size()-1);
        ss(arr,lt,i+1);

    }
    public List<List<Integer>> subsets(int[] nums) {
        ss(nums,new ArrayList<>(),0);
        return ans;
    }
}