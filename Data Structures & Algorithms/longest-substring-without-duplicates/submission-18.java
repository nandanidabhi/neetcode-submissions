
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;

        HashSet<Character> set = new HashSet<>();
        int maxCount = 0;
        int left = 0; // Tracks the start of the current substring

        // 'right' acts as your single loop index moving forward
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            // Time Efficiency Trick: 
            // Only remove elements from the left side until the duplicate 'c' is gone.
            while (set.contains(c)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(c);
            // Calculate current window size instantly using pointer math
            maxCount = Math.max(maxCount, right - left + 1);
        }

        return maxCount;
    }
}
