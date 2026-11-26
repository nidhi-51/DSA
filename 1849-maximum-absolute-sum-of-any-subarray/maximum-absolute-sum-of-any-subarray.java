class Solution {
    public int maxAbsoluteSum(int[] nums) {
        // if(nums.length <= 1){
        //     return Math.abs(nums[0]);
        // }
        int maxSum = nums[0];
        int minSum = nums[0];
        int ans  = Math.abs(nums[0]);
        for(int i = 1; i < nums.length; i++){
            maxSum = Math.max(nums[i] , maxSum + nums[i]);
            minSum = Math.min(nums[i] , minSum + nums[i]);
            int maxAbs = Math.abs(maxSum);
            int minAbs = Math.abs(minSum);
            ans = Math.max(ans, Math.max(maxAbs , minAbs));
        }
        return ans;
    }
}