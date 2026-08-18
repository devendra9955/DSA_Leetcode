/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        int sizeA = 0;
        while(tempA != null){
            tempA = tempA.next;
            sizeA++;
        }
        ListNode tempB = headB;
        int sizeB = 0;
        while(tempB != null){
            tempB = tempB.next;
            sizeB++;
        }
        tempA = headA;
        tempB = headB;
        if(sizeA > sizeB){
            for(int i=1; i<=sizeA-sizeB; i++){
                tempA=tempA.next;
            }
        }
        else{
            for(int i=1; i<=sizeB-sizeA; i++){
                tempB = tempB.next;
            }
        }
        while(tempA != tempB){
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return tempA;
    }
}