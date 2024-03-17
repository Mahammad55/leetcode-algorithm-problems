package array.medium;

import java.util.Arrays;

// 48
public class RotateImage {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate2(array);
    }

    public static void rotate(int[][] matrix) {
        int[][] rotateArray = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                rotateArray[i][j] = matrix[matrix[i].length - j - 1][i];
            }
        }

        for (int i = 0; i < rotateArray.length; i++) {
            for (int j = 0; j < rotateArray[i].length; j++) {
                matrix[i][j] = rotateArray[i][j];
            }
        }
    }

    public static void rotate1(int[][] matrix) {
        int[][] rotateArray = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                rotateArray[i][j] = matrix[matrix[i].length - j - 1][i];
            }
        }

        for (int i = 0; i < rotateArray.length; i++) {
            System.arraycopy(rotateArray[i], 0, matrix[i], 0, rotateArray[i].length);
        }
    }

    public static void rotate2(int[][] matrix) {
        int[][] rotateArray = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                rotateArray[i][j] = matrix[matrix[i].length - j - 1][i];
            }
        }

        matrix = rotateArray;

        System.out.println(Arrays.deepToString(matrix));
    }
}
