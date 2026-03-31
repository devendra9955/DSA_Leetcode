class Solution {
    public class Triplet implements Comparable<Triplet>{
        int x;
        int y;
        int d;
        Triplet(int x, int y , int d){
            this.x = x;
            this.y = y;
            this.d = d;
        }
        public int compareTo(Triplet t){
            return this.d - t.d;
        }
    }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Triplet> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<points.length; i++){
            int x = points[i][0];
            int y = points[i][1];
            int d = x*x + y*y;
            pq.add(new Triplet(x,y,d));
            if(pq.size() > k) pq.remove();
        }
        int[][] ans = new int[k][2];
        int i=0;
        while(pq.size()>0){
            Triplet top = pq.remove();
            ans[i][0] = top.x;
            ans[i][1] = top.y;
            i++;
        }
        return ans;
    }
}