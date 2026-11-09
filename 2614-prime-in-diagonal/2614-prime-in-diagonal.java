class Solution {
    public int diagonalPrime(int[][] nums) {

        int max_prime = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (isPrime(nums[i][i])) {
                max_prime = Math.max(max_prime, nums[i][i]);
            }
            if (isPrime(nums[i][n - 1 - i])) {
                max_prime = Math.max(max_prime, nums[i][n - 1 - i]);
            }
        }

        return max_prime;
    }
      public boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}