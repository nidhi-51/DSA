class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        ArrayList<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> lst = new ArrayList<>();

        subdup(nums, 0, lst, ans);
        return ans;
    }
    static void subdup(int[] nums, int index, ArrayList<Integer> lst, ArrayList<List<Integer>> ans){
        if(index == nums.length){
            ans.add( new ArrayList<>(lst));
            return;
        }
        lst.add(nums[index]);// ye ek ek element add karega
        subdup(nums, index + 1, lst, ans);

        lst.remove(lst.size() - 1);

        // for duplicate elemts to not get added in answer
        while(index + 1 < nums.length && nums[index] == nums[index + 1] ){
            index++;
        }
        subdup(nums, index + 1, lst , ans);
    }
}