class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int lo = 0;
         int n = arr.length;
         int hi = n-1;
        //  while(lo <= hi){
        //     int mid = (lo + hi)/2;
        //     if(mid-1 >=0 && mid+1 < n && arr[mid] > arr[mid+1] && arr[mid] < arr[mid-1]) hi = mid-1;
        //     else if(mid-1 >=0 && mid+1 < n && arr[mid] < arr[mid+1] && arr[mid] > arr[mid-1]) lo = mid+1;
        //     else if(mid-1 >=0 && mid+1 < n && arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1]) return mid;
        //      else {
        //         if (mid == 0) lo = mid + 1;
        //         else if (mid == n - 1) hi = mid - 1;
        //     }
        // }
        // return -1;
      
        while (lo < hi) {
            int mid = (lo + hi) / 2;

            if (arr[mid] < arr[mid + 1]) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }
}