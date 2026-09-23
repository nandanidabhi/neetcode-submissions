class Solution {
    public int[][] merge(int[][] intervals) {

        if(intervals == null || intervals.length <=1){
            return intervals;
        }
        //Sorted Intervals
        final int[][] sortedIntervals = intervals;
        Arrays.sort(sortedIntervals,(a,b) -> Integer.compare(a[0],b[0]));

        final List<int[]> mergedSegments = new ArrayList<>();

        //Initialize tracking with first sorted array
        int[] currentInterval = sortedIntervals[0];
        mergedSegments.add(currentInterval);
        

        for(int i =1;i<sortedIntervals.length;i++){

            final int nextStart = sortedIntervals[i][0];
            final int nextEnd = sortedIntervals[i][1];

            if(nextStart <= currentInterval[1] ){
                currentInterval[1] = Math.max(nextEnd, currentInterval[1]);
            } else {
                currentInterval=sortedIntervals[i];
                mergedSegments.add(currentInterval);
            }


        }

        return mergedSegments.toArray(new int[mergedSegments.size()][]);
    }
}
