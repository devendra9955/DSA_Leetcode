class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int lo = 0;
        int hi = n-1;
        while(lo <= hi){
            int mid = lo +(hi-lo)/2;
            int correct = mid+1;
            int missing = arr[mid]-correct;
            if(missing >= k) hi = mid-1;
            else lo = mid+1;
        }
        return hi+1+k;
    }
}