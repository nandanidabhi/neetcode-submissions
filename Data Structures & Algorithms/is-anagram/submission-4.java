class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> smap = new HashMap<>();
        // HashMap<Character, Integer> tmap = new HashMap<>();

        if(s.length()!=t.length()) return false;

        for(char s1:s.toCharArray()){
            smap.put(s1,smap.getOrDefault(s1,0)+1);
        }

        for(char c : t.toCharArray()){
            smap.put(c, smap.getOrDefault(c, 0) - 1);
        }

        for(int val : smap.values()){
            if(val != 0) return false;
        }

        return true;
    }
}
