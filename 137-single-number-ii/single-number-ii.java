class Solution {
    public int singleNumber(int[] nums) {
        return number(nums, 0, 0);
    }
    static int number(int[] nums, int index, int count){
        if(index == nums.length){
            return -1;
        }
        count = 0;
        for(int j = 0; j < nums.length; j++){
            if(nums[index] == nums[j]){
                count++;
            }
        }
         if(count == 1){
                return nums[index];
            }
        return number(nums, index + 1,0);
    }
}