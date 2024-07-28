//gfg

class Solution{
    static int evenlyDivides(int N){
        // code here
        int x=N,num=0,count=0;
        while(x>0){
            num=x%10;
            x=x/10;
            if(num!=0 && N%num==0)count++;
        }
        return count;
    }
}
