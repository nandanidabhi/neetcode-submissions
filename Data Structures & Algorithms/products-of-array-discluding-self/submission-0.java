class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] x1 = new int[nums.length];
        int[] x2 = new int[nums.length];

        x1[0]=1;
        x2[nums.length-1]=1;
        for(int i=1;i<nums.length;i++){
            x1[i]=x1[i-1]*nums[i-1];
        }
        
        for(int j=nums.length-1;j>0;j--){
            x2[j-1]=x2[j]*nums[j];
        }

        int[] x3 = new int[nums.length];
        int j=0;
        while(j<nums.length){
            x3[j] = x2[j] * x1[j];
            j++;
        }

        return x3;
    }
}  
