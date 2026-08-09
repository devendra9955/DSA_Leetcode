class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int sum = 0;
        int max = 0;
        for(int i=0; i<k; i++){
            sum = sum + cardPoints[i];
        }
        max = Math.max(max,sum);
        int left = k-1;
        int right = n-1;
        while(left>=0){
            sum = sum - cardPoints[left];
            sum = sum + cardPoints[right];
            left--;
            right--;
            max = Math.max(max,sum);
        }
        return max;
    }
}