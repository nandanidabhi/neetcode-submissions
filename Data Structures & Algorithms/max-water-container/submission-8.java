class Solution {
    public int maxArea(int[] heights) {
        int maxAreaOfWater = 0;
        int leftBar = 0;
        int rightBar = heights.length - 1;

        while(leftBar < rightBar){
            maxAreaOfWater = Math.max(maxAreaOfWater, Math.min(heights[leftBar], heights[rightBar]) * (rightBar - leftBar));
            if(heights[leftBar] < heights[rightBar]){
                leftBar++;
            } else {
                rightBar--;
            }
        }

        return maxAreaOfWater;
    }
}
