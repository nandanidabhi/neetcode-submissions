class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxCount = 0;

        if(s.length() == 0 && s.isEmpty()) return 0;

        for(int i=0;i<s.length();i++){
            Set<Character> chars = new HashSet<>();
            for(int j=i;j<s.length();j++){
                if(chars.contains(s.charAt(j))) {
                   break;

                } 
                chars.add(s.charAt(j));
            }
            maxCount = Math.max(maxCount, chars.size());
        }

        return maxCount;
    }
}
