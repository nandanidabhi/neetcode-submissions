class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int maxCount = 1;
        int currentCount = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                continue;
            }
            if (nums[i] == nums[i + 1] - 1) {
                currentCount++;
            } else {
                maxCount = Math.max(maxCount, currentCount);
                currentCount = 1;
            }
        }
        return Math.max(maxCount, currentCount);
    }
}