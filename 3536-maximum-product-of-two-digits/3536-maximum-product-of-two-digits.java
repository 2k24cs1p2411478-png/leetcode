class Solution {
    public int maxProduct(int n) {
        int max = Integer.MIN_VALUE;
        if(n <= 9){
            return 0;
        }
        ArrayList<Integer> result = new ArrayList<>();
        while(n > 0){
            result.add(n%10);
            n= n/10;
        }
        for(int i=0;i<result.size();i++){
            for(int j=i+1;j<result.size();j++){
                max = Math.max(result.get(i) * result.get(j) , max);
            }
        }
        return max;
        
    }
}