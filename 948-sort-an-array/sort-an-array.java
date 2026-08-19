class Solution {
    public int[] sortArray(int[] nums) {
        return mergeSort(nums, 0, nums.length);
    }
    static int[] mergeSort(int[] nums, int s, int e){
        if(e - s <= 1){
            return Arrays.copyOfRange(nums, s, e);
        }
        int m = s + (e - s)/2;
        int[] left = mergeSort(nums, s, m);
        int[] right = mergeSort(nums, m, e);

        return merge(left , right);
    }
    static int[] merge(int[] first, int[] last){
        int[] mix = new int[first.length + last.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < first.length && j < last.length){
            if(first[i] < last[j]){
                mix[k] = first[i];
                i++;
                k++;
            }
            else{
                mix[k] = last[j];
                j++;
                k++;
            }
        }
        while(i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while(j < last.length){
            mix[k] = last[j];
            j++;
            k++;
        }
        return mix;
    }
}