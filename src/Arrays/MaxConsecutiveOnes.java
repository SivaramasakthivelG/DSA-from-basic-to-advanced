package Arrays;

public class MaxConsecutiveOnes {

    // https://leetcode.com/problems/max-consecutive-ones/description/
    public static void main(String[] args) {

        int[] arr = {1,1,0,1,1,1};

        System.out.println(findMaxR(arr,0,0,0));
        System.out.println(findMaxConsecutiveOnes(arr));
    }

    //Recursion
    public static int findMaxR(int[] nums, int n, int count, int res){
        if(n >= nums.length){
            return Math.max(res,count);
        }
        if(nums[n]==0){
            res = Math.max(res,count);
            count = 0;
        }else{
            count++;
        }
        return findMaxR(nums,n+1,count,res);
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int res = 0;
        int count = 0;

        for(int i: nums){
            if(i==0){
                res = Math.max(res,count);
                count = 0;
            }else{
                count++;
            }
        }
        return Math.max(res,count);
    }
}
