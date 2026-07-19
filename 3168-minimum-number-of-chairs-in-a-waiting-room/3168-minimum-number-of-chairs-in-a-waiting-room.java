class Solution {
    public int minimumChairs(String s) {
        int avail = 0;
        int max = 0;
        char[] arr = s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 'E'){
                avail++;
                  max = Math.max(max, avail);
            }
            else 
                avail--;

        }
        return max;

    }
}