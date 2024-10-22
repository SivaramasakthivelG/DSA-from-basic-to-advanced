package Others;

public class NoOfOccurenceBin {

    public static void main(String[] args) {


        int[] arr = {10,11};

        int start = firstPosition(arr, 10);
        int last = lastPosition(arr, 10);

        int ans = (start == -1) ? 0 : (last - start + 1);
        System.out.println(ans);

    }

    static int firstPosition(int[] arr, int target) {

        int start = 0;
        int end = arr.length -1;
        int pos = -1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                pos = mid;
                end = mid - 1;
            }

        }
        return pos;

    }

    static int lastPosition(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int pos = -1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                pos = mid;
                start = mid + 1;
            }

        }
        return pos;
    }
}


