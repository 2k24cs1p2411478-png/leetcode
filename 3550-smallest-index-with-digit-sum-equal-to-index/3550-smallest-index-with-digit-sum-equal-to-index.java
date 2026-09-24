class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int number = nums[i];
            int sum = 0;
           while(number != 0){
            int digit = number % 10;
            sum += digit;
            number = number /10;
           }
           if(sum == i){
            return i;
           }
        }
        return -1;
    }
}