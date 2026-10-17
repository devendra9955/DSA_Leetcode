class Solution {
    public int sumCounts(List<Integer> nums) {
        HashSet<Integer> set = new HashSet<>();
        int n = nums.size();
        int sum = 0;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                for(int k=i; k<=j; k++){
                    set.add(nums.get(k));
                }
                int lengths = set.size();
                int square = lengths*lengths;
                sum = sum + square;  
                set.clear();
            }
        }
        return sum;
    }
}