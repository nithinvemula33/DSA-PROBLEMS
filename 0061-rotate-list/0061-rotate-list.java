/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        int x=0;
        if(head==null || head.next==null) return head;
        ListNode z=head;
        int c=0;
        while(z!=null)
        {
            c++;
            z=z.next;
        }
        k=k%c;
        while(x!=k)
        {
            x++;
            ListNode t=head;
            while(t.next.next!=null)
            {
                t=t.next;
            }
            ListNode n=new ListNode(t.next.val);
            t.next=null;
            n.next=head;
            head=n;
        }
        return head;
    }
}