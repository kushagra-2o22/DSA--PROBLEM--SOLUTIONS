// leetcode:- https://leetcode.com/problems/two-sum/description/

//solution -1 (Brute force)

public int[] twoSum(int[] nums, int target) {
      for(int i=0;i<nums.length-1;i++){
          for(int j=i+1;j<nums.length;j++){
              if(nums[i]+nums[j]==target){
                  return new int[]{i,j};
              }
          }
      }
      return null;  
    }

//solution-2 (optimal )

public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            int moreNeeded = target - num;
            if (mpp.containsKey(moreNeeded)) {
                ans[0] = mpp.get(moreNeeded);
                ans[1] = i;
                return ans;
            }

            mpp.put(nums[i], i);
        }
        return ans;
        }
    
