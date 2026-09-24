class Solution {
    public int subarraySum(int[] nums, int k) {
        int result = 0, curSum = 0;
        Map<Integer, Integer> prefixSums = new HashMap<>();
        prefixSums.put(0,1);

        for(int num : nums){
            curSum = curSum + num;
            int diff = curSum - k;
            result = result + prefixSums.getOrDefault(diff,0);
            prefixSums.put(curSum, prefixSums.getOrDefault(curSum, 0) + 1);
        }

        return result;
    }
}