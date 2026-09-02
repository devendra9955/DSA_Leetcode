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
    public ListNode merge(ListNode head1, ListNode head2) {
        if(head1 == null && head2 != null) return head2;
        if(head2 == null && head1 != null) return head1;
        ListNode i = head1;
        ListNode j = head2;
        ListNode dummy = new ListNode(-1);
        ListNode t = dummy;
        while(i != null && j != null){
            if(i.val <= j.val){
                t.next = i;
                i = i.next;
            }
            else{
                t.next = j;
                j=j.next;
            }
            t = t.next;
        }
        t.next = (i!=null) ? i:j;
        return dummy.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        int n = lists.length;
        ArrayList<ListNode> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            arr.add(lists[i]);
        }
        if(lists==null || lists.length==0) return null;
        while(arr.size() > 1){
            ListNode a = arr.get(arr.size()-1);
            arr.remove(arr.size()-1);
            ListNode b = arr.get(arr.size()-1);
            arr.remove(arr.size()-1);
            ListNode c = merge(a,b);
            arr.add(c);

        }
        return arr.get(0);
    }
}