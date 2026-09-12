class Solution {
    public int countSpecialIntegers(int[] nums) {
        int[] count = new int[101];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                count[nums[i]]++;
            }
        }
        int ans = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] == 1) {
                ans++;
            }
        }

        return ans;
    }
}