class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        for(int ele : stones) pq.add(ele);

        while(pq.size()>1){
            int x = pq.remove();
            int y = pq.remove();
            if(x != y){
                int result = x-y;
                pq.add(result);
            }  
        }
        if(pq.size()==0) return 0;
        else return pq.peek();
    }
}