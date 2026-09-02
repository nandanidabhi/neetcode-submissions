class Solution {
    public int maxArea(int[] heights) {
        int maxArea = 0;
        int len = heights.length;
        int left = 0;
        int right = len - 1;
        while (left < right) {
            int min = 0;
            if (heights[left] != heights[right]) {
                min = Math.min(heights[left], heights[right]);
            } else {
                min = heights[left];
            }
            maxArea = Math.max(maxArea, min * (right - left));
            if (heights[left] < heights[right]) {
                left++;
            } else if (heights[left] > heights[right]) {
                right--;
            } else {
                left++;
                right--;
            }
        }
        return maxArea;
    }
}
