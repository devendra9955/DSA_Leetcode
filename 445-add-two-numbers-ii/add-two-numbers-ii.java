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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null || l2 == null) return null;
        ListNode temp1 = reverse(l1);
        ListNode temp2 = reverse(l2);
        ListNode dummy = new ListNode(-1);
        ListNode dumtemp = dummy;
        int sum = 0;
        int carry = 0;
        while(temp1 != null || temp2 != null){
            int val1 = 0;
            int val2 = 0;

            if (temp1 != null) {
                val1 = temp1.val;
                temp1 = temp1.next;
            }

            if (temp2 != null) {
                val2 = temp2.val;
                temp2 = temp2.next;
            }
            sum = carry + val1 + val2;
            carry = sum /10;
            ListNode newHead = new ListNode(sum%10);
            dumtemp.next = newHead;
            dumtemp = dumtemp.next;
           
        }
        if(carry != 0){
            dumtemp.next = new ListNode(carry);
        }
        return reverse(dummy.next);

    }
}