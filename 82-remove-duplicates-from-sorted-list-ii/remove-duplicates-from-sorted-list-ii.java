class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode t = dummy;
        ListNode i = head;
        ListNode j = head;

        while(i != null){
            if(i.next == null || i.val != i.next.val){
                t.next = i;
                t = i;              
                i = i.next;
            }

            else{
                j = i.next;
                while(j != null &&  i.val == j.val){
                    j = j.next;
                }
                i=j;
            }
        }

        t.next = i;
        return dummy.next;
    }
}