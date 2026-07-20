class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int p =0,q=0;
        int m = mat.length;
        int n = mat[0].length;
        if (m * n != r * c) {
            return mat;
        }
        int[][] result = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                result[i][j] = mat[p][q]; 
                q++;
                if (q == n) {
                    q = 0;
                    p++;
               }
          }
     }
        return result;
    }
}