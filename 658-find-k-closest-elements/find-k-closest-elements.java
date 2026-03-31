// class Solution {
//     public List<Integer> findClosestElements(int[] arr, int k, int x) {
//         PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->((b[1]!=a[1]) ? b[1]-a[1] : a[0]-b[0]));
//         for(int ele : arr){
//             int diff = Math.abs(x-ele);
//             if(diff==0) continue;
//             int[] a = {ele,diff};
//             pq.add(a);
//             if(pq.size() > k) pq.remove();
//         }
//         List<Integer> ans = new ArrayList<>();
//         while(pq.size()>0){
//             int[] top = pq.remove();
//             ans.add(top[0]);
//         }
//         Collections.sort(ans);
//         return ans;
//     }
// }


class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        PriorityQueue<int[]> pq =
            new PriorityQueue<>((a,b)->((b[1]!=a[1]) ? b[1]-a[1] : b[0]-a[0]));

        for(int ele : arr){
            int diff = Math.abs(x-ele);

            int[] a = {ele,diff};
            pq.add(a);

            if(pq.size() > k) pq.remove();
        }

        List<Integer> ans = new ArrayList<>();

        while(pq.size()>0){
            int[] top = pq.remove();
            ans.add(top[0]);
        }

        Collections.sort(ans);
        return ans;
    }
}
