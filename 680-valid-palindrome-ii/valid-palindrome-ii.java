class Solution {
    public boolean pallindrome(String s,int i, int j){
        int n = s.length();
        while(i<j){
            if(s.charAt(i) != s.charAt(j)) return false;
            else{
                i++;
                j--;
            }
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int n = s.length();
        int i = 0;
        int j = n-1;
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return pallindrome(s,i+1,j) || pallindrome(s,i,j-1);
            }
             i++;
            j--;
        }
        return true;
       
    }

}