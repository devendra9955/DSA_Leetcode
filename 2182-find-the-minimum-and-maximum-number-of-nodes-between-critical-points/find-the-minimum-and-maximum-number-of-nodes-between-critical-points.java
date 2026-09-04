class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] ans = new int[2];
        int idx = 1;

        ListNode a = head;
        ListNode b = a.next;
        ListNode c = b.next;

        int firstidx = -1;
        int lastidx = -1;
        int mindist = Integer.MAX_VALUE;

        while (c != null) {

            if ((b.val < a.val && b.val < c.val) ||
                (b.val > a.val && b.val > c.val)) {

                if (firstidx == -1)
                    firstidx = idx;

                if (lastidx != -1)
                    mindist = Math.min(mindist, idx - lastidx);

                lastidx = idx;
            }

            idx++;
            a = a.next;
            b = b.next;
            c = c.next;
        }

        int max = lastidx - firstidx;

        if (max == 0)
            max = -1;

        if (mindist == Integer.MAX_VALUE)
            mindist = -1;

        ans[0] = mindist;
        ans[1] = max;

        return ans;
    }
}