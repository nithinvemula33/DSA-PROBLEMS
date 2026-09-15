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
    public ListNode deleteDuplicates(ListNode head) {
        // Node d=new Node(0);
        //  d.next=head;
        ListNode t1=head;
        if(head==null) return null;
        if(t1.next==null) return head;
        while(t1!=null&&t1.next!=null)
        {
            if(t1.val==t1.next.val)
            {
                t1.next=t1.next.next;
            }
            else t1=t1.next;
        }
        return head;
    }
}