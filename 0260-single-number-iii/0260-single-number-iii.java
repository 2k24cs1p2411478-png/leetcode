class Solution {
    public int[] singleNumber(int[] nums) {
        int[] ans = new int[2];
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+ 1);
        }
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(hm.get(nums[i])== 1){
                ans[j] = nums[i];
                j++;
            }
           
        }
        return ans;
    }
}