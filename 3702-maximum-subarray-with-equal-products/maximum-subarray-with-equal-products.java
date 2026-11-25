class Solution {
    public static long findGCD(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static long findLCM(long a, long b) {
        if (a == 0 || b == 0) return 0;
        return (a / findGCD(a, b)) * b;
    }
    public int maxLength(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            long product = 1;
            long lcm = 1;
            long gcd = 0;
            for(int j=i; j<n; j++){
                product = product * nums[j];
                gcd = findGCD(gcd,nums[j]);
                lcm = findLCM(lcm,nums[j]);
                if(product == gcd*lcm){
                max = Math.max(max,j-i+1);
                }
            }
            

        }
        
        return max;
    }
}