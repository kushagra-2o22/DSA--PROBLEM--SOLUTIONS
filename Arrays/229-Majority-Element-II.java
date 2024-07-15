// leetcode:- https://leetcode.com/problems/majority-element-ii/description/

// solution

//Moore's Voting Algorithm

class Solution {
    public List<Integer> majorityElement(int[] nums) {
       int count1=0,count2=0;
       int el1=Integer.MIN_VALUE,el2=Integer.MIN_VALUE;
       List<Integer> ans=new ArrayList<>();
       for(int i=0;i<nums.length;i++){
        if(count1==0 && el2!=nums[i]){
            count1=1;
            el1=nums[i];
        }else if(count2==0 && el1!=nums[i]){
            count2=1;
            el2=nums[i];
        }else if(el1==nums[i]){
            count1++;
        }else if(el2==nums[i]){
            count2++;
        }else{
            count1--;
            count2--;
        }
        
       }
       count1=0;
       count2=0;
       for(int i=0;i<nums.length;i++){
        if(el1==nums[i])count1++;
        if(el2==nums[i])count2++;
       }
    if(count1>nums.length/3)ans.add(el1);
    if(count2>nums.length/3)ans.add(el2);
    
       return ans; 
    }
}
