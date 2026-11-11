class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean inc = true;
        boolean dec = true;

        for(int i = 1; i < nums.length; i++) {
            if(nums[i-1] > nums[i])
             inc = false;
            if(nums[i-1] < nums[i])
             dec = false;
        }

        return inc || dec;
    }
}