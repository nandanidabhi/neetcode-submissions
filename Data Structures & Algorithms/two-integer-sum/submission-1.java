class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numsMap = new HashMap<>();
        int n = nums.length;
        int[] result = new int[2];

        for(int i=0;i<n;i++){
            int subtract = target - nums[i];
            if(numsMap.containsKey(subtract)){
                result[0] = numsMap.get(subtract);
                result[1] = i;
                return result;
            } else {
                numsMap.put(nums[i],i);
            }
        }

        return null;
    }
}
