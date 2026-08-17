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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode slow = head;
        ListNode fast = head;
        for(int i=1; i<=k; i++){
            fast = fast.next;
        }
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        ListNode slow1 = slow;
        ListNode temp = head;
        slow = head;
        for(int i=1; i<k; i++){
            slow = slow.next;
        }
        int temp1 = slow1.val;
        slow1.val = slow.val;
        slow.val = temp1;
        return head;
    }
}