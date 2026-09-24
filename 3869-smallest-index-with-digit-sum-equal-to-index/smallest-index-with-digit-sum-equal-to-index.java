class Solution {
    public int smallestIndex(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int sum = 0;
            int n = nums[i];
            while(n > 0){
                int digit = n % 10;
                sum = sum + digit;
                n = n / 10;
            }
             if(sum == i){
                return i;
             }
             i++;
        }
        return -1;
    }
}