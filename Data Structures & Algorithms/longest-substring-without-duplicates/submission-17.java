class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int maxCount = Integer.MIN_VALUE;
        int count = 0;
        if (s == null || s.length() == 0)
            return 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (set.contains(c)) {
                maxCount = Math.max(maxCount, count);
                set.clear();

                int firstOccurrenceIndex = s.lastIndexOf(String.valueOf(c), i - 1);
                i = firstOccurrenceIndex;
                count = 0;
            } else {
                set.add(c);
                count++;
                maxCount = Math.max(maxCount, count);
            }
        }
        return maxCount;
    }
}
