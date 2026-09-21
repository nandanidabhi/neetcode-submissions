class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    
        if(nums.length == 0 || k < 1 ) return new int[0];

        Map<Integer, Integer> countMap = new HashMap<>();
        for (int n : nums) {
            countMap.put(n, countMap.getOrDefault(n, 0) + 1);
        }

        Map<Integer, List<Integer>> bucketMap = new HashMap<>();
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            int frequency = entry.getValue();
            bucketMap.computeIfAbsent(frequency, key -> new ArrayList<>()).add(entry.getKey());
        }


        int[] topKfreq = new int[k];
        int index = 0;
        for (int f = nums.length; f > 0; f--) {
            if (bucketMap.containsKey(f)) {
                for (int num : bucketMap.get(f)) {
                    topKfreq[index++] = num;
                    if (index == k) {
                        return topKfreq;
                    }
                }
            }
        }
        return topKfreq;
    }
}
