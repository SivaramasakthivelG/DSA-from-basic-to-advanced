package Others.Matrix;

public class MatrixTranspose {

    public static void main(String[] args) {

        int[] arr = {11, 99, 18, 5};


        for (int i : arr) {
            System.out.println(i);
        }
    }

    public int[][] transpose(int[][] matrix) {
        // 10 -> 01 and 20 -> 02
        int n = matrix.length;  //row
        int m = matrix[0].length; // column
        int[][] mat2 = new int[m][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                // get in correct order from matrix and paste vertically in mat 2
                mat2[j][i] = matrix[i][j];
            }
        }
        return mat2;
    }

}
