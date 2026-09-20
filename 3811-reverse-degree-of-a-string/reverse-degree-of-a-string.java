class Solution {
    public int reverseDegree(String s) {
        int n = s.length();
        int product = 1;
        int sum = 0;
        for(int i=1; i<=n; i++){
            char ch = s.charAt(i-1);
            int val = 'z'-ch+1;
            product = val * i;
            sum = sum + product;
        }
        return sum;
    }
}