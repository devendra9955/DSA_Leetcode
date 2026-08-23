class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums2.length;
        int m = nums1.length;
        int ans[] = new int[m];
        Stack<Integer> st = new Stack<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=n-1; i>=0; i--){
            while(st.size() > 0 && st.peek() <= nums2[i]){
                st.pop();
            }
            if(st.size()==0){
                hm.put(nums2[i],-1);
            }
            else{
                hm.put(nums2[i],st.peek());
            }
            st.push(nums2[i]);
        }
        for(int i=0; i<nums1.length; i++){
            if(hm.containsKey(nums1[i])){
                ans[i] = hm.get(nums1[i]);
            }
        }
        return ans;
    }
}