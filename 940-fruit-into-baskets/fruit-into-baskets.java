class Solution {
    public int totalFruit(int[] fruits) {
        int n= fruits.length;
        int lastFruit = -1;
        int secondLast = -1;
        int lastCount = 0;
        int currMax = 0;
        int max = 0;
        for(int i = 0; i < n; i++){
            int fruit = fruits[i];
            if(fruit == lastFruit || fruit == secondLast){
                currMax++;
            }
            else{
                currMax = lastCount +1;
            }
            if(fruit == lastFruit){
                lastCount++;
            }
            else{
                lastCount = 1;
                secondLast = lastFruit;
                lastFruit = fruit;
            }
            max = Math.max(max, currMax);
        }
        return max;
    }
}