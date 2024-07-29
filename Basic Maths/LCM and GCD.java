class Solution {
    static Long[] lcmAndGcd(Long A , Long B) {
        // code here
        Long lcm=A*B;
        Long gcd=(Long)1L;
        while(A>0 && B>0){
            if(A<B){
                B=B-A;
            }else{
                A=A-B;
            }
        }
        if(A==0){
           gcd=B; 
        }else if(B==0){
            gcd=A;
        }
        Long[] ans=new Long[2];
        lcm=lcm/gcd;
        ans[0]=lcm;
        ans[1]=gcd;
        return ans;
    }
};
