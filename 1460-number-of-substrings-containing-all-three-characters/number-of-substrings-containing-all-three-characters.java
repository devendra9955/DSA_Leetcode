class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int arr[] = new int[3];
        int i=0; 
        int j = 0;
        int result = 0;
        while(n>j){
            char ch = s.charAt(j);
            arr[ch-'a']++;

            while(arr[0]>0 && arr[1]>0 && arr[2] > 0){
                result = result + (n-j);

                arr[s.charAt(i)-'a']--;
                i++;
            }
            j++;
        }
        return result;
    }
}