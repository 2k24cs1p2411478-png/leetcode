class Solution {
    public boolean uniformArray(int[] nums1) {
        boolean hasodd = false;
        boolean haseven = false;
        int min =  nums1[0];
        for(int i=0;i<nums1.length;i++){
            min = Math.min(min,nums1[i]);
            if(nums1[i] %2 == 0)
                haseven = true;
            else
                hasodd = true;
        }
        if(!hasodd || !haseven){
            return true;
        }
        return min % 2 == 1; 
    }
}