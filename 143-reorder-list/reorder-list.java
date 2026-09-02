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
    public ListNode reverse(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode prev = null;
        ListNode curr = head;
        ListNode fwd = head.next;
        while(curr != null && curr.next != null){
            curr.next = prev;
            prev = curr;
            curr = fwd;
            fwd = curr.next;
        }
        curr.next = prev;
        prev = curr;
        return prev;
    }
    public void reorderList(ListNode head) {
        ListNode temp = head;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode newhead = reverse(slow.next);
        slow.next = null;
        ListNode temp2 = newhead;
        ListNode newtemp = new ListNode(-1);
        ListNode newt = newtemp;
        while(temp != null && temp2 != null){
            newt.next = temp;
            temp = temp.next;
            newt = newt.next;
            newt.next = temp2;
            temp2 = temp2.next;
            newt = newt.next;
        }
        if (temp != null)
            newt.next = temp;

        if (temp2 != null)
            newt.next = temp2;
    }
}