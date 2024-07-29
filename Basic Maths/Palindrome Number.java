class Solution {
    public boolean isPalindrome(int x) {
        int n=x,num=0,sum=0;
        while(n>0){
            num=n%10;
            sum=(sum*10)+num;
            n=n/10;
        }
        if(x==sum)return true;
        return false;
    }
}
