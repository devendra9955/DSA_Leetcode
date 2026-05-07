class Solution {
    public int pivotIndex(int[] arr) {
        int n = arr.length;
       //prefix sum 
       int pre[] = new int[arr.length];
       pre[0] = arr[0];
       for(int i=1; i<arr.length; i++){
        pre[i] = pre[i-1]+arr[i];
       }

       //suffix
       int suf[] = new int[arr.length];
       suf[n-1] = arr[n-1];
       for(int i=n-2; i>=0; i--){
        suf[i] = suf[i+1]+arr[i];
       }
       for(int i=0; i<pre.length && i<suf.length; i++){
        if(pre[i]==suf[i]) return i;
       }
       return -1;
    }
}
