package Others;

public class BinarySearch {

    /** Binary search application find the ceiling and floor */

    /**
     * @Ceil : Smallest number greather than or equal to target
     * @Floor : Greatest number smaller than or equal to target
     */


    public static void main(String[] args) {

        int[] arr = {2, 5, 9, 14, 16, 18};

        int floor = searchFloor(arr, 10);
        int ceil = searchCeil(arr, 10);

        System.out.println(floor);
        System.out.println(ceil);


    }


    static int searchCeil(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        int ceil = -1;

        //Mid always find the answer since start and end are moving, by using target > arr[mid] we can effectively navigate start and end
        //to find the answer we need.

        while (s <= e) {
            int mid = s + (e - s) / 2;


            if (arr[mid] == target) {
                return arr[mid];
            } else if (target > arr[mid]) {
                s = mid + 1;
            } else {
                ceil = arr[mid];
                e = mid - 1;
            }
        }
        return ceil;
    }

    static int searchFloor(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        int floor = -1;

        //Mid always find the answer since start and end are moving, by using target > arr[mid] we can effectively navigate start and end
        //to find the answer we need.

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] == target) {
                return arr[mid];
            } else if (target > arr[mid]) {
                s = mid + 1;
                floor = arr[mid];
            } else {
                e = mid - 1;
            }
        }
        return floor;
    }

}
