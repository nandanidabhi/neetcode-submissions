class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<int[]> s = new Stack<>();
        int n = temperatures.length;
        int[] result = new int[n];

        for(int i=0;i<temperatures.length;i++){
            int t = temperatures[i];
            while(!s.isEmpty() && t > s.peek()[0]){
                int[] pair = s.pop();
                result[pair[1]] = i - pair[1];
            }
            s.push(new int[]{t,i});
        }

        return result;
    }
}
