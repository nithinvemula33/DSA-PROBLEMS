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
    static boolean check(List<Integer>lt,int c)
    {
        if(lt.size()==1)return true;
        if(c%2==0)
        {
            for(int i=1;i<lt.size();i++)
            {
                if(lt.get(i-1)>lt.get(i)) return false;
                if(lt.get(i-1)==lt.get(i)) return false;
            }
        }
        else
        {
            for(int i=1;i<lt.size();i++)
            {
                if(lt.get(i-1)<lt.get(i)) return false;
                if(lt.get(i-1)==lt.get(i)) return false;
            }
        }
        return true;
    }
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        int c=0;
        while(!q.isEmpty())
        {
            int n=q.size();
            List<Integer>lt=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                TreeNode cur=q.peek();
                if(cur.left!=null)q.offer(cur.left);
                if(cur.right!=null)q.offer(cur.right);
                if(c%2==0&&cur.val%2!=0)
                {lt.add(cur.val);}
                else if(c%2!=0&&cur.val%2==0)
                {
                    lt.add(cur.val);
                } 
                else return false;
                q.remove();
            }
            if(!check(lt,c))
            {
                    return false;
            }c++;
            
        }
        return true;
    }
}