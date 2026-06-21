class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int n = costs.length;
        int count = 0;
        int sum = 0;
        for(int i=0; i<n; i++){
            if(sum+costs[i] > coins ) return count;
            sum += costs[i];
            count++;
        }
        return count;
    }
}