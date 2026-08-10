class Solution {
    public boolean isMonotonic(int[] nums) {
       return increasing(nums, 0) || decreasing(nums, 0);
    }
    static boolean increasing(int[] nums, int index){
        if(nums.length - 1 == index){
            return true;
        }
        if(nums[index] > nums[index + 1]){
            return false;
        }
        return increasing(nums, index + 1);
    }
    static boolean decreasing(int[] nums, int index){
        if(nums.length - 1 == index){
            return true;
        }
        if(nums[index] <  nums[index + 1]){
            return false;
        }
        return decreasing(nums, index + 1);
    }
}