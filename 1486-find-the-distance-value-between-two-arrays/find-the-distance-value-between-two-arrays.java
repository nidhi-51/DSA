class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        int i = 0;
        while(i < arr1.length){
            boolean valid = true;
            for(int j = 0; j < arr2.length; j++){
                int dist = Math.abs(arr1[i] - arr2[j]);
                if(dist <= d){
                    valid = false;
                    break;
                }
            }
            if(valid){
                    count++;
                }
            i++;
        }
        return count;
    }
}