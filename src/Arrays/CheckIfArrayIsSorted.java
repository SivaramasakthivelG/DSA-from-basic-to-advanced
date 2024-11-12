package Arrays;

public class CheckIfArrayIsSorted {

    // https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/

    public static void main(String[] args) {

        int[] arr = {9, 1, 2, 4, 7, 8}; //n = 7

        boolean value = check(arr);
//        System.out.println(value);
//        for (int i : arr) {
//            System.out.println(i);
//        }


        //recursion
        boolean r = checkR(arr, 1,0);
        System.out.println(r);

    }

    public static boolean check(int[] nums) {

        int count = 0;

        for(int i=1;i<=nums.length;i++){
            if(nums[i -1] <= nums[i% nums.length]){

            }else{
                count++;
                if(count>1){
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean checkR(int[] arr,int n,int count){

        if(count > 1) return false;

        if(n > arr.length) return true;

        if(arr[n-1] > arr[n % arr.length]) count++;

        return checkR(arr,n+1,count);
    }

}
