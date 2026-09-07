class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> sp = new HashSet<>();
        for(int n:nums){
            sp.add(n);
        }

        int longest = 0;

        for(int ns:sp){
            if(!sp.contains(ns - 1)){
                int length = 1;
                while(sp.contains(ns+length)){
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
}
