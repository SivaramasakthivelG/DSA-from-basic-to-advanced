package Others.Matrix;


// L48 - https://leetcode.com/problems/rotate-image/description/

public class RotateImage {

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        rotate(matrix);


    }

    public static void rotate(int[][] matrix) {

        int n = matrix.length;

        // transpose
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // row reverse
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j < n/2){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[i][n-1 - j];
                    matrix[i][n-1 - j] = temp;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
