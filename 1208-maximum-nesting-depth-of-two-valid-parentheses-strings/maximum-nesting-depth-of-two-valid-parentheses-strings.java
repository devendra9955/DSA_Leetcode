class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int n = seq.length();
        int[] ans = new int[n];
        int i = 0;
        int group = 1;
        while(i<n){
            if(seq.charAt(i)=='('){
                ans[i] = 1-group;
            }
            else if(seq.charAt(i)==')'){
                ans[i] = group;
            }
            group = group^1;
            i++;
        }
        return ans;
    }
}