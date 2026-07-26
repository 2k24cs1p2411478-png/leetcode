class Solution {
    public int maximumProduct(int[] nums) {
       int product =1;
       int n = nums.length-1;
       Arrays.sort(nums);
       for(int i=n;i>=n-2;i--){
        product = product * nums[i];
       } 
       int product2= nums[0]*nums[1]*nums[n];
       return Math.max(product,product2);
    }
}
