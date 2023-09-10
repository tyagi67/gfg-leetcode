class Solution {
    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int e : nums){
            if(e > max){
                max = e;
            }
            if(e < min){
                min = e;
            }
        }
        return gcd(min, max);
    }
    
    public int gcd(int a, int b){
        if(b==0){
            return a;
        }
        return gcd(b, a%b);
    }
}