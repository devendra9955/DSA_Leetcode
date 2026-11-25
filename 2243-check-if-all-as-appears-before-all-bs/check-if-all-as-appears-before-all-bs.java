class Solution {
    public boolean checkString(String s) {
        int n = s.length();
        boolean flag = false;
        if(n==1) return true;
        for(int i=0; i<n-1; i++){
            if(s.charAt(i) <= s.charAt(i+1)) flag = true;
            else{
                flag = false;
                break;
            }
        }
        return flag;
    }
}