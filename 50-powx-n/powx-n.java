class Solution {
    public double myPow(double x, int n) {
        long z = n;
        return power(x, n, 0);
    }
    static double power(double x, long n, int i){
        double y = Math.pow(x, n);
        if(n < 0){
            return 1 / Math.pow(x, -n);
        }
        if(Math.pow(x,i) == y){
            return y;
        }
        return power(x, n, i + 1);
    }
}