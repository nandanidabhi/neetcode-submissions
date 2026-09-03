class Solution {
    public int characterReplacement(String s, int k) {
        // Use an array instead of a HashMap for maximum speed
        int[] count = new int[26];
        int maxf = 0;
        int res = 0;
        
        int i = 0; // Left pointer of our window
        for (int j = 0; j < s.length(); j++) {
            // Add the new character to our window
            count[s.charAt(j) - 'A']++;
            maxf = Math.max(maxf, count[s.charAt(j) - 'A']);
            
            // If the window is invalid, shrink it from the left
            // Current window size is (j - i + 1)
            while ((j - i + 1) - maxf > k) {
                count[s.charAt(i) - 'A']--;
                i++; // Move left pointer forward
            }
            
            // The window is guaranteed to be valid here
            res = Math.max(res, j - i + 1);
        }
        
        return res;
    }
}
