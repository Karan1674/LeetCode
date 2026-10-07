class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        
        int[] freq = new int[26];

        for(char ch : s.toCharArray()){
            freq[ch - 'a'] = freq[ch - 'a'] + 1;
        }

        for(char ch : t.toCharArray()){
            if(freq[ch - 'a'] == 0) return false;

            freq[ch - 'a'] = freq[ch - 'a'] - 1;
        }

        for(int i = 0; i < freq.length; i++){
            if(freq[i] != 0) return false;
        }

        return true;
    }
}