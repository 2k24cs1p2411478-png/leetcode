class Solution {
    public int[] numberGame(int[] nums) {
        int arr[] = new int[nums.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }
        int i = 0;
        while(!pq.isEmpty()){
            int alice = pq.poll();
            int bob = pq.poll();
            arr[i++]=bob;
            arr[i++]=alice;
        }
        return arr;
    }
}