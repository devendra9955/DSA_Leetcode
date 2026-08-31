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
    public ListNode oddEvenList(ListNode head) {
        ListNode dummy1 = new ListNode(-1);
        ListNode dumtemp1 = dummy1;
        ListNode dummy2 = new ListNode(-1);
        ListNode dumtemp2 = dummy2;
        int pos = 1;
        ListNode temp = head;
        while(temp != null){
            if(pos % 2 == 1){
                dumtemp1.next = temp;
                dumtemp1 = temp;
            }
            else{
                dumtemp2.next = temp;
                dumtemp2 = temp;
            }
            temp = temp.next;
            pos++;
        }
        dumtemp1.next = null;
        dumtemp2.next = null;
        dumtemp1.next = dummy2.next;
        return dummy1.next;
    }
}