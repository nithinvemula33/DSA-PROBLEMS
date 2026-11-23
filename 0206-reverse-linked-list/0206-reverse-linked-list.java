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
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null)return head;
        ListNode t=head;
        ArrayList<Integer> al=new ArrayList<>();
        while(t!=null)
        {
            al.add(t.val);
            t=t.next;
        }
        //System.out.println(al);
        t=head;
        int i=al.size()-1;
        while(t!=null)
        {
            t.val=al.get(i);
            t=t.next;
            i--;
        }
        return head;

    
    }
}