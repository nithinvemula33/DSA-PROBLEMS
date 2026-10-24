/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    static int check(List<Integer> lt)
    {
        int max=Integer.MIN_VALUE;
        
        for(int i:lt)
        {
            if(max<i){max=i;}
        }
        return max;
    }
    public List<Integer> largestValues(TreeNode root) {
        List<Integer>ans=new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();
        if(root==null)return ans;
        q.add(root);
        int max=0;
        while(!q.isEmpty())
        {
            List<Integer>al=new ArrayList<>();
            int n=q.size();
            for(int i=0;i<n;i++){
            TreeNode cur=q.peek();
            if(cur.left!=null) q.add(cur.left);
            if(cur.right!=null) q.add(cur.right);
            al.add(cur.val);
            max=check(al);
            q.remove();
            }
            ans.add(max);
        }
        
        return ans;
    }
    
}