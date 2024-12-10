package Hashing;

import java.util.HashMap;

public class LongestSubArraywithSumK {

    public static void main(String[] args) {
        int[] arr = {1, -1, 5, -2, 3};

        System.out.println(lenOfLongestSubArr(arr,3));
    }

    public static int lenOfLongestSubArr(int[] arr, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int sum = 0;
        int res = 0;
        hm.put(0,-1);
        int val[] = new int[2];



        for(int i=0;i<arr.length;i++){
            sum += arr[i];

            if(hm.containsKey(sum-k)){
                res = Math.max(res,i-hm.get(sum-k));

                if(i-hm.get(sum-k) == res){
                    val[0] =hm.get(sum-k)+1;
                    val[1] =i;
                }
            }

            if(!hm.containsKey(sum)){
                //we are printing starting and ending index of the largest sum
                hm.put(sum,i);
            }

        }

        for (int i : val) {
            System.out.println(i);
        }

        return res;

    }

}
