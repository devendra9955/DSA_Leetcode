class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> ans = new ArrayList<>();
        int left  = 0;
        int right;
        int n = s.length();
        int k = p.length();
        if(n<k) return ans;
        int freq[] = new int[26];
        for(int i=0; i<k; i++){
            freq[p.charAt(i)-'a']++;
        } 
        int freq1[] = new int[26];
        for(right=0; right<k; right++){
            freq1[s.charAt(right)-'a']++;
            if(Arrays.equals(freq,freq1)) ans.add(left);
        }
        while(right < n){
            freq1[s.charAt(left)-'a']--;
            left++;
            freq1[s.charAt(right)-'a']++;
            right++;
            if(Arrays.equals(freq,freq1)) ans.add(left);
        }
        return ans;
    }
}