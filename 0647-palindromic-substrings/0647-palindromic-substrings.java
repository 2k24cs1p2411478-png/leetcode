
class Solution {
    public int countSubstrings(String s) {
        int count = 0;
        int n = s.length();

        boolean[][] matrix = new boolean[n][n];

        for (int g = 0; g < n; g++) {
            for (int i = 0; i + g < n; i++) {
                int j = i + g;

                if (g == 0) {
                    matrix[i][j] = true;
                }
                else if (g == 1) {
                    if (s.charAt(i) == s.charAt(j)) {
                        matrix[i][j] = true;
                    }
                    else {
                        matrix[i][j] = false;
                    }
                }
                else {
                    if (s.charAt(i) == s.charAt(j) && matrix[i + 1][j - 1]) {
                        matrix[i][j] = true;
                    }
                    else {
                        matrix[i][j] = false;
                    }
                }

                if (matrix[i][j] == true) {
                    count++;
                }
            }
        }

        return count;
    }
}
