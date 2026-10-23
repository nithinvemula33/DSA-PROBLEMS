import java.util.*;
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
    static void rev(List<Integer> lt)
    {
        int n=lt.size();
        int j=n-1;
        for(int i=0;i<j;i++)
        {
            Collections.swap(lt,i,j);
            j--;
        }
        System.out.println(lt);
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>ans=new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        int c=0;
        while(!q.isEmpty())
        {
            List<Integer>lt=new ArrayList<>();
            int n=q.size();
            for(int i=0;i<n;i++)
            {
                TreeNode cur=q.peek();
                if(cur.left!=null) q.add(cur.left);
                if(cur.right!=null) q.add(cur.right);
                lt.add(cur.val);
                q.remove();
            }
            if(c%2!=0) {rev(lt);}
            c++;
            ans.add(lt);
        }
        return ans;

    }
}