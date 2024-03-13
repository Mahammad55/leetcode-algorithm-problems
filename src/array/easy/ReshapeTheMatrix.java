package array.easy;

// 566
public class ReshapeTheMatrix {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length, n = mat[0].length;
        if (m * n != r * c) return mat;

        int[][] a = new int[r][c];
        int row = 0;
        int column = 0;

        for (int[] array : mat) {
            for (int j = 0; j < n; j++) {
                if (column == c) {
                    row++;
                    column = 0;
                }
                a[row][column++] = array[j];
            }
        }

        return a;
    }
}
