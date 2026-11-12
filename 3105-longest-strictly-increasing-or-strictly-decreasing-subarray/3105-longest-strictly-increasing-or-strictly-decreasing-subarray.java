class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        int maxinlength = 1;
        int maxdelength = 1;
        int inlength = 1;
        int delength = 1;
        for(int  i =0;i<n- 1;i++){
          if(nums[i] < nums[i+1])
             inlength++;
           else if(nums[i] >= nums[i+1])
             inlength = 1;
         maxinlength = Math.max(maxinlength,inlength);

        }
        for(int  i =0;i<n- 1;i++){
          if(nums[i] > nums[i+1])
             delength++;
           else if(nums[i] <= nums[i+1])
             delength = 1;
         maxdelength = Math.max(maxdelength,delength);
        }
        return Math.max(maxdelength,maxinlength);
    }
}