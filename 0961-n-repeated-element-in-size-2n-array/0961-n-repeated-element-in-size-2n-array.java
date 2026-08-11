class Solution {
    public int repeatedNTimes(int[] nums) {
        int maxcount= 0;
      for(int i=0;i<nums.length;i++){
         int count=0;
        for(int j=0;j<nums.length;j++){
            if(nums[i] == nums[j]){
                count++;
            }
            maxcount = Math.max(maxcount,count);
        }
             if(maxcount == nums.length /2){
            return nums[i];
      }
      }
      return -1;
    }
}