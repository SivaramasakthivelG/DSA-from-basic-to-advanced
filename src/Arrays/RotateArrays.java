package Arrays;

public class RotateArrays {

    //https://leetcode.com/problems/rotate-array/description/

    public static void main(String[] args) {

        int[] arr = {14,16,88,9};
        int k = 9;
        int  n = arr.length;
        k = k%n;

        //solution 1
        rotate(arr,k);


        //solution 2
        reverse(arr,0,n-1); // reverse the whole array
        reverse(arr,0,k-1); // reverse upto k
        reverse(arr,k,n-1); // reverse after k

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

    //Normal intuitive approach
    private static void rotate(int[] nums, int k){
        int  n = nums.length;
        k = k%n;

        int[] arr = new int[n];

        // Modulo helps for effective rotation
        for(int i=0;i<nums.length;i++){
            arr[(i+k)%n] = nums[i];
        }
        // Just paste back the result to nums
        for(int i=0;i<nums.length;i++){
            nums[i] = arr[i];
        }
    }

    //Reverse and reverse Approach
    public static void reverse(int[] arr,int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

}
