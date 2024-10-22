package Others;

public class BinarySearchInfiniteNumbers {


    /** Assume when an function receives infinite array
     * but we want to find whether the array has "target"
     * this approach is crucial
     * @find -> target
     */
    public static void main(String[] args) {

        int[] arr = {2, 5, 9, 14, 16, 18,55,66,77,88,99,102};

        int start = 0;
        int end = 1;

        int target = 14;

        while(target > arr[end]){
            start = end+1;
            end = end * 2;
        }

        int ans = binarySearch(arr,target,start,end);

        System.out.println(ans);
//        System.out.println(end);


    }

    static int binarySearch(int[] arr, int target,int s,int e) {
        while (s <= e) {
            int mid = s + (e - s) / 2;


            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return -1;
    }

}
