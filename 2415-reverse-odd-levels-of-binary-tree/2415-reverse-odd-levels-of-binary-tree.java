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
    public TreeNode reverseOddLevels(TreeNode root) {
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        int c=0;
        while(!q.isEmpty())
        {
            int n=q.size();
            List<TreeNode>lt=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                TreeNode cur=q.poll();
                if(cur.left!=null)q.add(cur.left);
                if(cur.right!=null)q.add(cur.right);
                lt.add(cur);
            }
            if(c%2!=0)
            {
                int i=0;
                int j=lt.size()-1;
                while(i<j)
                {
                    int temp=lt.get(i).val;
                    lt.get(i).val=lt.get(j).val;
                    lt.get(j).val=temp;
                    i++;j--;
                }
            }
            c++;
        }
        return root;
    }
}