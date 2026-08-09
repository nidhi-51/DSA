class Solution {
    public boolean isPowerOfThree(int n) {
        return power(n, 0);
    }
    static boolean power(int n, int x){
        if(n == 0)
        return false;

        if(x > 19){
            return false;
        }
        if(n == Math.pow(3,x)){
            return true;
        }
        return power(n, x + 1);
    }
}