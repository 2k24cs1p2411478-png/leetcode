class Solution {
    public int maxPower(String s) {
            int length = 1;
            int maxoccurence = 1;
            char[] arr = s.toCharArray();
            for(int i=0;i<arr.length - 1;i++){
              if(arr[i] == arr[i+1])
                  length++;
               else 
                    length =1;
             maxoccurence = Math.max(maxoccurence,length);
                
        } 
        return maxoccurence;
    }
}