class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> result = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        Arrays.sort(nums);
        int start = nums[0];
        int  end = nums[nums.length - 1];

        for(int i=start;i<=end;i++){
            if(!set.contains(i)){
                result.add(i);
            }
        }
        return result;
    }
}