class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
      int[] result = new int[nums1.length];
      for(int i=0;i<nums1.length;i++){
        int target = nums1[i];
            for(int j=0 ;j<nums2.length;j++)
            if(nums2[j] == target)
                nextelement(j,nums2,result,i);
      }
      return result;
    }
public void nextelement(int index, int[] nums2, int[] result, int ele_to_put) {

    result[ele_to_put] = -1;
    for (int i = index + 1; i < nums2.length; i++) {
        if (nums2[i] > nums2[index]) {
            result[ele_to_put] = nums2[i];
            return;
        }
    }
  }
}
    
