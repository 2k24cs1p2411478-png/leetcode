class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n= nums.length;
        int[] result = new int[n];
        int[] positive = new int[n/2];
        int[] negative = new int[n/2];
        int pe =0;
        int ne =0;
        for(int i=0;i<n;i++){
            if(nums[i] > 0){
                positive[pe++] = nums[i];
            }
            if(nums[i] < 0){
                negative[ne++] = nums[i];
            }
        }
        for(int i=0;i<n/2;i++){
                result[2*i] = positive[i];
                result[2*i+1] = negative[i];
        }
        return result;
    }
}