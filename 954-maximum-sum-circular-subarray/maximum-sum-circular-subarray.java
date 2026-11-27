class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxSum = nums[0];
        int minSum = nums[0];
        int ans = nums[0];
        int total = nums[0];
        int minAns = nums[0];
        for(int i = 1; i < nums.length; i++){
            maxSum = Math.max(nums[i], maxSum + nums[i]);
            minSum = Math.min(nums[i], minSum + nums[i]);
            ans = Math.max(ans, maxSum);
            minAns  = Math.min(minAns, minSum);
            total += nums[i];
        }
        if(ans < 0){ // for negative ones
            return ans;
        }
        return Math.max(ans, total - minAns);
    }
}