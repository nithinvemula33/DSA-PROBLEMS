/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        Queue<Node>q=new LinkedList<>();
        if(root==null)return null;
        q.add(root);
        while(!q.isEmpty())
        {
            int n=q.size();

            ArrayList<Node>al=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                Node cur1=q.poll();
                if(cur1.left!=null)q.add(cur1.left);
                if(cur1.right!=null)q.add(cur1.right);
                al.add(cur1);
            }
            System.out.println(al);
            for(int i=0;i<al.size()-1;i++)
            {
                al.get(i).next=al.get(i+1);
            }
        }
        return root;

    }
}