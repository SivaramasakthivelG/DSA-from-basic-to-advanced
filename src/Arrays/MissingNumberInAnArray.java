package Arrays;

public class MissingNumberInAnArray {

    // https://leetcode.com/problems/missing-number/description/

    public static void main(String[] args) {

        int[] arr = {0,2,3,4,5,6};

        int n = arr.length;

        System.out.println(missedNumberR(arr,n-1,(n*(n+1)/2))); // recursion

        System.out.println(missingNumber(arr)); // normal
    }

    public static int missedNumberR(int[] nums, int n, int missedNum){
        if(n<0){
            return missedNum;
        }

        return missedNumberR(nums,n-1,missedNum - nums[n]);
    }

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int sum =  n*(n+1)/2;

        for(int num:nums){
            sum -= num;
        }

        return sum;
    }

}
