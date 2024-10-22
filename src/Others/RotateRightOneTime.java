package Others;

public class RotateRightOneTime {

    /** Rotated array by one time */

    public static void main(String[] args) {

        int[] arr = {9, 14, 16, 18, 2, 5};

        int n = arr.length - 1;
        int last = arr[n];


        for (int i = n; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        // Place the last element at the start
        arr[0] = last;

        for (int i : arr) {
            System.out.println(i);
        }


    }


}
