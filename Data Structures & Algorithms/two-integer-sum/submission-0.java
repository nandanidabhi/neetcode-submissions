class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(j<nums.length){
                    if(target == (nums[i]+nums[j])){
                        int[] r = new int[2];
                        r[0]=i;
                        r[1]=j;
                        return r;
                    }
                }
            }
        }
        return null;
    }
}
