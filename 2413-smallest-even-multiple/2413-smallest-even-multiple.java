class Solution {
    public int smallestEvenMultiple(int n) {
       int answer= small(2,n);
        return answer;
    }
  public int small(int a, int b) {
        int gcd = GCD(a, b);
        return (a * b) / gcd;
    }
    public int GCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}