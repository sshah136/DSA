package Arrays;

public class LC1572DiagonalSum {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int len = mat.length;

        for (int i = 0; i < mat.length; i++) {
            len--;
            if (i == len) {
                sum += mat[i][i];

            } else {
                sum += mat[i][i];
                sum += mat[i][len];
            }

        }
        return sum;
    }
}
