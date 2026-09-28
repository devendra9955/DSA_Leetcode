class Solution {
    public int maxDepth(String s) {
        Stack st = new Stack<>();
        int n = s.length();
        int i = 0;
        int max = Integer.MIN_VALUE;
        int count = 0;
        while(i < n){
            if(s.charAt(i)=='('){
                count++;
                max = Math.max(max,count);
            }
            else if(s.charAt(i)==')'){
                count--;
            }
            i++;
        }
        return max==Integer.MIN_VALUE ? 0:max;
    }
}