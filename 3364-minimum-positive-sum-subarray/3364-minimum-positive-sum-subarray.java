class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int minsum = Integer.MAX_VALUE;
        int n = nums.size();
        for(int size = l; size <= r; size++) {
            for(int i = 0; i <= n - size; i++) {
                int sum = 0;
                for(int j = 0; j < size; j++) {
                    sum += nums.get(i + j);
                }
                if(sum > 0) {
                    minsum = Math.min(minsum, sum);
                }
            }
        }

        return minsum == Integer.MAX_VALUE ? -1 : minsum;
    }
}