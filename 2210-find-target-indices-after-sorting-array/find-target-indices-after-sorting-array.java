class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        ArrayList<Integer> lst = new ArrayList<>() ;
        return index(nums, target, 0, lst);
    }
    static ArrayList<Integer> index(int[] nums, int target, int index, ArrayList<Integer> list){
        if(index == nums.length){
            return list;
        }
        if(nums[index] == target){
            list.add(index);
        }
        return index(nums, target, index + 1, list);
    }
}