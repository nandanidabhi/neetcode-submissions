class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] a=s.toCharArray();
            Arrays.sort(a);
            String sortedKey = new String(a);

            map.putIfAbsent(sortedKey,new ArrayList<>());
            map.get(sortedKey).add(s);
        }

        return new ArrayList<>(map.values());

    }
}
