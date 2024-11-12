package Arrays;

import java.util.LinkedHashSet;

public class RemoveDubsInArray {
    //https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/

    public static void main(String[] args) {

        int[] arr = {1, 1, 1, 2, 2, 2, 4, 4, 5, 5, 5};

        int k = removeDuplicates(arr);
        for (int i=0;i<k;i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();



        LinkedHashSet<Integer> hs = new LinkedHashSet<>();
        rem(arr,arr.length-1,hs);

        int j = 0;
        for(int i: hs){
            arr[j] = i;
            System.out.print(arr[j]+ " ");
            j++;
        }


    }


    public static int removeDuplicates(int[] nums) {

        LinkedHashSet<Integer> hs = new LinkedHashSet<>();

        for(int i: nums){
            hs.add(i);
        }

        int j=0;

        for(int i: hs){
            nums[j++] = i;
        }

        return hs.size();
    }

    // Using recursion
    public static void rem(int[] arr, int n,LinkedHashSet<Integer> hs){

        if(n<0){
            return;
        }

        rem(arr,n-1,hs);

        hs.add(arr[n]);

    }

}
