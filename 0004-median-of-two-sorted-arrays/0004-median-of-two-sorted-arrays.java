class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        double median = 0;
        int[] result = new int[m+n];
        for(int i=0;i<n;i++){
            result[i] = nums1[i];
        }
        for(int j=0;j<m;j++){
            result[j + n] = nums2[j];
        }
        Arrays.sort(result);
        if(result.length % 2 != 0)
             median = result[result.length /2];
        else{
            int p =  result[result.length /2];
            int q =  result[(result.length  /2) - 1];
             median = (p + q)/2.0;
        }
            return median;
    }
}