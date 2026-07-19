class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int length = 1;
        int maxlength = 1;
        if(nums.length == 0)
            return 0;
        for(int i=0;i<nums.length -1;i++){
            if(nums[i] < nums[i+1])
                length++;
            else
               length = 1;
             maxlength = Math.max(maxlength, length);
        }
            return maxlength;
    }
}