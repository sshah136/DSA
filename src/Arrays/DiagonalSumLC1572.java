package Arrays;

public class DiagonalSumLC1572 {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int len = mat.length;

        for (int i = 0; i < mat.length; i++) {
            len--;
            sum += mat[i][i];
            if(i != len){
                sum += mat[i][len];
            }
        }
        return sum;
    }
}
