class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        
        if(intervals == null || intervals.length == 0) {
            return new int[][] { newInterval };
        }
        
        final List<int[]> mergedSegments = new ArrayList<>();

        for(int[] interval : intervals){
            if(newInterval == null || interval[1] < newInterval[0]){
                mergedSegments.add(interval);
            } else if(interval[0] > newInterval[1]){
                mergedSegments.add(newInterval);
                mergedSegments.add(interval);
                newInterval = null;
            } else {
                newInterval[0] = Math.min(interval[0], newInterval[0]);
                newInterval[1] = Math.max(interval[1], newInterval[1]);
            }
        }

        if(newInterval != null) mergedSegments.add(newInterval);
        return mergedSegments.toArray(new int[mergedSegments.size()][]);    

    }
}
