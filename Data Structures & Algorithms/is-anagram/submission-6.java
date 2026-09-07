class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }

        Map<Character,Integer> map = new HashMap<>();

        for(char ss:s.toCharArray()){
            if(map.containsKey(ss)){
                map.put(ss,map.get(ss)+1);
            } else {
                map.put(ss,1);
            }
        }

        Map<Character,Integer> mapt = new HashMap<>();

        for(char ss:t.toCharArray()){
            if(mapt.containsKey(ss)){
                mapt.put(ss,mapt.get(ss)+1);
            } else {
                mapt.put(ss,1);
            }
        }

        return map.equals(mapt);
    }
}
