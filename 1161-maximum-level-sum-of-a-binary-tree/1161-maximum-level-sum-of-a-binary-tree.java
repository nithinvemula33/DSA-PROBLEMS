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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        int c=0,x=-1,max=Integer.MIN_VALUE;

        while(!q.isEmpty())
        {
            List<Integer>al=new ArrayList<>();
            int n=q.size();
            int sum=0;
            for(int i=0;i<n;i++)
            {
                
                TreeNode cur=q.peek();
                if(cur.left!=null) q.add(cur.left);
                if(cur.right!=null) q.add(cur.right);
                al.add(cur.val);
                sum+=cur.val;
                q.remove();
            }
            c++;
            if(sum>max)
            {
                max=sum;
                x=c;
            }
        }
        return x;
    }
}