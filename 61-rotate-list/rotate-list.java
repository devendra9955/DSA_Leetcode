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
        ListNode slow = head;
        ListNode fast = head;
        int n = 0;
        ListNode temp = head;
        if(head == null || head.next==null || k==0) return head;
        while(temp != null){
            temp = temp.next;
            n++;
        }
        k %= n;
        if(k==0) return head;
        for(int i=1; i<=k; i++){
            fast = fast.next;
        }
        
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
       ListNode temp3 = slow.next;
       slow.next = null;
       fast.next = head;
       return temp3;

    }
}