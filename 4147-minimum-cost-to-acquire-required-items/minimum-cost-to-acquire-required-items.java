class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        int pair = Math.min(need1,need2);
        long pairCost = Math.min(costBoth,cost1+cost2);
        long total = 0;
        total += (long) pair*pairCost;
        total += (long) (need1-pair)*cost1;
        total += (long) (need2-pair)*cost2;
        total = Math.min(total,(long)Math.max(need1,need2)*costBoth);
        return total;
    }
}