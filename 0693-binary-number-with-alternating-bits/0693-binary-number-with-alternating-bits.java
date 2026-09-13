class Solution {
    public boolean hasAlternatingBits(int n) {
        while(n > 0){
            if(n%2 == 0){
                n = n/2;
                if(n%2 == 0){
                    return false;
                }
            }
            if(n%2 == 1){
                n = n/2;
                if(n%2 == 1){
                    return false;
                }
            }
        }
        return true;
    }
}