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
        ListNode fwd = null;
        ListNode curr = head;
        while(curr != null){
             fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        return prev;
       
    }
    public int pairSum(ListNode head) {
        ListNode slow= head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode a = slow.next;
        slow.next = null;
        a = reverse(a);

        ListNode t1 = head;
        ListNode t2 = a;
        int max = Integer.MIN_VALUE;
        while(t2 != null){
            int sum = t1.val + t2.val;
            if(sum > max){
                max = sum;
            }
            t1 = t1.next;
            t2 = t2.next;

        }
        return max;
    }
}