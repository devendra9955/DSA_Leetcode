class Solution {
    public int mySqrt(int x) {
        long lo = 0;
        long hi = x;
        while(lo <= hi){
            long mid = lo+(hi-lo)/2;
            if(mid * mid > x) hi = mid-1;
            else if(mid*mid < x) lo = mid+1;
            else return (int)mid;
        }
        return (int)hi;
    }
}