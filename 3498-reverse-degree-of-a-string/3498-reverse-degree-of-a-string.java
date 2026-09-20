class Solution {
    public int reverseDegree(String s) {
        int product = 0;
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
          int reverse = 'z' - ch + 1;
            product += reverse * (i+1);
        }
        return product;
    }
}