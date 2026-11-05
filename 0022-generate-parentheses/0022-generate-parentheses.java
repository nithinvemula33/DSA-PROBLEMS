class Solution {
    void gen(int ob,int cb,String s,List<String>ans)
    {
        if(ob==0&&cb==0)
        { ans.add(s);return;}
        if(ob>0)gen(ob-1,cb,s+"(",ans);
        if(cb>ob)gen(ob,cb-1,s+")",ans);
    }
    public List<String> generateParenthesis(int n) {
        
    List<String> ans=new ArrayList<>();
        gen(n,n,"",ans);
        return ans;
    }
}