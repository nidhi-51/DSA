class Solution {
    public boolean check(int[] nums) {
         return sortedRotated(nums, 0, 0);
    }
    static boolean sortedRotated(int[] nums, int index , int count){
        if(nums.length == index){
            return count <= 1;
        }
        int next = (index + 1) % nums.length;
        if(nums[index] > nums[next]){
            count++;
        }
        if(count > 1){
            return false;
        }
        return sortedRotated(nums, index + 1, count);
    }
}