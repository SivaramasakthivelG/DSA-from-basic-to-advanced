package Sorting;

public class InsertionSort {
    public static void main(String[] args) {

        int[] arr = new int[]{5, 7, 8, 3, 2, 6, 4, 1, 99, 0};
        int n = arr.length;
        int temp;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                //if the next element lesser than first element swap
                if (arr[j] < arr[j - 1]) {

                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;

                } else {

                    break;
                }
            }
        }

        for (int i : arr) {
            System.out.println(i);
        }

    }
}