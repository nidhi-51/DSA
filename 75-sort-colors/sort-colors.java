class Solution {
    public void sortColors(int[] nums) {
        bubbleSort(nums);
    }
    public void bubbleSort(int[] nums){
        for(int i = 0; i < nums.length; i++){
            int j = i + 1;
            while(j < nums.length){
                if(nums[i] > nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
                j++;
            }
        }
    }
}