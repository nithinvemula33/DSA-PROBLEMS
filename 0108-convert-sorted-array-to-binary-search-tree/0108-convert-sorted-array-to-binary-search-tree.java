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
    static TreeNode fun(int i,int j,int[] arr)
    {
        if(i>j)return null;
        int m=(i+j)/2;
        TreeNode root=new TreeNode(arr[m]);
        root.left=fun(i,m-1,arr);
        root.right=fun(m+1,j,arr);
        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return fun(0,nums.length-1,nums);
    }
}