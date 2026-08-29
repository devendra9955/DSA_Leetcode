class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map = new HashMap<>();
        int n = s.length();
        int maxFreq = 0;
        int max = Integer.MIN_VALUE;
        int i=0;
        int j=0;
        while(j<n){
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
            maxFreq = Math.max(maxFreq,map.get(s.charAt(j)));
            if(j-i+1 - maxFreq > k){
                map.put(s.charAt(i),map.get(s.charAt(i))-1);
                i++;
            }
            max = Math.max(max,j-i+1);
            j++;
        }
       
        return max;
    }
}