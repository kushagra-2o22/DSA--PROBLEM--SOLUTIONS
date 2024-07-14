// leetcode :- https://leetcode.com/problems/powx-n/

//Solution

// make it recurse like if 2^10 then 2^5 * 2^5 so that we calculate only half an multiply it to the same .

class Solution {
    public double myPow(double x, int n) {
        if(n<0){
            return 1/(x*myPow(x,-n-1));
        }
        else if(n==0)return 1;
        double halfpow=myPow(x,n/2);
        double halfsq=halfpow*halfpow;
        if(n%2!=0){
            halfsq=x*halfsq;
        }
     
     return halfsq;
    }
}
