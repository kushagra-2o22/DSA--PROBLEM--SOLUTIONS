// leetcode:- https://leetcode.com/problems/majority-element/description/

// Solution-1  O(n^2)

public int majorityElement(int[] nums) {
        int count=0;
       for(int i=0;i<nums.length;i++){
        for(int j=0;j<nums.length;j++){
            if(nums[i]==nums[j]){
                count++;
                
        }
       }
       if(count>nums.length/2)return nums[i];
       count=0;
            } 
            return -1;
}

//solution-2 O(nlogn)

public int majorityElement(int[] nums) {
Arrays.sort(nums);
    int count=1;
    for(int i=0;i<nums.length-1;i++){
        if(nums[i]==nums[i+1]){
            count++;
        }else if(nums[i]!=nums[i+1]){
            count=1;

        }
        if(count>nums.length/2){
            return nums[i];
        }
    }
    return nums[0];
}

//solution -3 O(n)

//Moore's Voting Algorithm

public int majorityElement(int[] nums) {
int count=1;
    int el=nums[0];
    for(int i=1;i<nums.length;i++){
        if(count==0){
            count=1;
            el=nums[i];
        }else if(el==nums[i]){
            count++;
        }else{
            count--;
        }
    }
    return el;
    }
