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
    static void po(TreeNode root,List<Integer> lt)
    {
        if(root==null) return;
        lt.add(root.val);
        po(root.left,lt);
        po(root.right,lt);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> lt=new ArrayList<>();
        po(root,lt);
        return lt;
    }
}