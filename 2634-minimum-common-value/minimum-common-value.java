class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        int n1 = nums1.length;
        int n2 = nums2.length;
        int in = n1-1;
        int jn = n2-1;
        while(i <= in && j<=jn){
           if(nums1[i]==nums2[j]) return nums1[i];
           if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return -1;
    }
}