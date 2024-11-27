package Arrays;

public class MoveZerosToEnd {

    // https://leetcode.com/problems/move-zeroes/description/

    public static void main(String[] args) {

        int[] arr = {0,1,0,3,12};

//        moveZeroes(arr);


        for (int i : arr) {
            System.out.print(i+ " ");
        }

        System.out.println();
        int count = moveZerosNRecursion(arr,0,0);
        for (int i=count;i<arr.length;i++){
            arr[i] = 0;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

    public static void moveZeroes(int[] nums) {
        int n = nums.length;

        // Here the intuition is manipulate the array effectively without zero
        int count = 0;
        for(int i: nums){
            if(i != 0){
                nums[count++] = i;
            }
        }

        // append zeros in the end
        for(int i=count;i<n;i++){
            nums[i] = 0;
        }
    }

    //Have to do it in recursion
    public static int moveZerosNRecursion(int[] arr,int n,int count){
        if(arr[n] !=0) arr[count++] = arr[n];

        if(n >= arr.length -1){
            return count;
        }

        return moveZerosNRecursion(arr,n+1,count);


    }

}
