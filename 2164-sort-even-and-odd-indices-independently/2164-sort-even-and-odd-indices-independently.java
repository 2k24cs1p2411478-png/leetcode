class Solution {

    public int[] sortEvenOdd(int[] nums) {

        int[] result = new int[nums.length];

        int[] even = new int[(nums.length + 1) / 2];
        int[] odd = new int[nums.length / 2];

        int ev = 0;
        int od = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                even[ev++] = nums[i];
            } else {
                odd[od++] = nums[i];
            }
        }
        Arrays.sort(even);
        Arrays.sort(odd);
        reverse(odd);

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                result[i] = even[i / 2];
            } else {
                result[i] = odd[i / 2];
            }
        }

        return result;
    }

    public void reverse(int[] arr) {

        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}