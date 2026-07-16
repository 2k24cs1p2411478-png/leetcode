class Solution {
    public long gcdSum(int[] nums) {
        int[] prefixGcd = new int[nums.length];
        int max = nums[0];
        prefixGcd[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
                  max = Math.max(max, nums[i]);     
                 prefixGcd[i] = gcd(nums[i], max);
            }
            Arrays.sort(prefixGcd);
            int low = 0,high= nums.length - 1;
            long sum =0;
              
            while(low < high){
             sum += gcd(prefixGcd[low],prefixGcd[high]);
              
               low++;
               high--;
            }
            return sum;
    }
   public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}