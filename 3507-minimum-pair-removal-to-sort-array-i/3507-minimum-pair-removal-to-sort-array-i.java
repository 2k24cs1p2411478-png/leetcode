class Solution {
    public int minimumPairRemoval(int[] nums) {
        ArrayList<Integer>hold  = new ArrayList<>();
        for (int i = 0;i < nums.length;i++){
            hold.add(nums[i]);
        }
        int count = 0;
        while(!isSorted(hold)) {
            int minSum = Integer.MAX_VALUE;
            int index = 0;
            for (int i = 0; i < hold.size() - 1; i++) {
                int sum =hold.get(i) + hold.get(i + 1);
                if (sum < minSum) {
                    minSum = sum;
                    index = i;
                }
            }
            hold.set(index, minSum);
            hold.remove(index + 1);
            count++;
        }
        return count;
    }
    public boolean isSorted(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
}