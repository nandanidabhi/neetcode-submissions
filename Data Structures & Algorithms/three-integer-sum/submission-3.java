
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // Sorting is mandatory to skip duplicates efficiently

        for (int i = 0; i < nums.length - 2; i++) {
            // FIX 1: Skip the first element if it is identical to the previous one
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            // Scan inward from both ends of the remaining array
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    // FIX 2: Fast-forward left and right pointers past identical numbers
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    
                    // Step past the last duplicate values
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++; // Sum is too small; move left to get a bigger number
                } else {
                    right--; // Sum is too big; move right to get a smaller number
                }
            }
        }
        return result;
    }
}
