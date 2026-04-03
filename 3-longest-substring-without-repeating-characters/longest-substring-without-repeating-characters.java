class Solution {
    public int lengthOfLongestSubstring(String s) {
        // int max = 0;
        // for(int i=0; i<s.length(); i++){
        //     String str = "";
        //     for(int j=i; j<s.length(); j++){
        //         char ch =s.charAt(j);
        //         if(str.indexOf(ch) != -1) break;
        //         str = str + ch;
        //         int len = j-i+1;
        //         max = Math.max(len,max);
        //     }
        // }
        // return max;

        HashSet<Character> set = new HashSet<>();
        int maxLen = 0;
        int i=0;
        int j = 0;
        while(j < s.length()){
            char ch = s.charAt(j);
            if(!set.contains(ch)){
                set.add(ch);
                j++;
            }
            else{
                int len = j-i;
                maxLen = Math.max(maxLen,len);
                while(s.charAt(i) != ch){
                    set.remove(s.charAt(i));
                    i++;
                }
                i++;
                j++;
            }
        }
        int len = j-i;
        maxLen = Math.max(maxLen,len);
        return maxLen;

    }
}