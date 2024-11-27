package Hashing;

import java.util.HashMap;

public class SingleNumber {

    public static void main(String[] args) {

        int[] arr = {1,2,1,4,4};


        System.out.println(singleNumber(arr));
        System.out.println(singleNumberH(arr));
    }

    public static int singleNumber(int[] nums) {
        int res = 0;
        for(int f: nums){
            res = f^res;
        }
        return res;
    }

    public static int singleNumberH(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap();

        for(int i: nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }

        for(int i: nums){
            if(hm.get(i) == 1){
                return i;
            }
        }
        return 0;
    }

}
