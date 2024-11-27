package Hashing;

import java.util.HashMap;

public class TwoSum {

    // https://leetcode.com/problems/two-sum/


    public static void main(String[] args) {

        int[] arr = {-3,4,3,90};
        int k = 0;

        for (int i : twoSum(arr, k)) {
            System.out.print(" " + i);
        }
        System.out.println();
        for (int i : twoSumH(arr, k)) {
            System.out.print(" " + i);
        }
    }

    public static int[] twoSum(int[] nums, int target) {

        int n = nums.length;

        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j] == 0){
                    return new int[]{i,j};
                }
            }
        }


        return new int[]{};
    }

    public static int[] twoSumH(int[] nums, int target) {

        HashMap<Integer,Integer> hm = new HashMap();

        int index = 0;
        for(int i: nums){
            hm.put(i,index);
            index++;
        }

        for(int i=0;i<nums.length;i++){
            int difference = target - nums[i];

            if(hm.containsKey(difference) && hm.get(difference) != i){
                return new int[]{i,hm.get(difference)};
            }
        }

        return new int[]{};
    }

}
