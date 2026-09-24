class Solution {
    public int maxArea(int[] heights) {
        int maxAreaofWater = 0;

        int left = 0, right = heights.length-1;

        while(left < right){
            int minHeight = Math.min(heights[left], heights[right]);
            maxAreaofWater = Math.max(maxAreaofWater,minHeight * (right - left));

            if(heights[right] > heights[left]){
                left++;
            } else if(heights[right] < heights[left]){
                right--;
            } else {
                left++;
                right--;
            }
        }

        return maxAreaofWater;
        
    }
}
