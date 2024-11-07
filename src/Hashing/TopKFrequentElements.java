package Hashing;

import java.util.HashMap;

public class TopKFrequentElements {
    public static void main(String[] args) {

        int[] arr = {1, 1, 1, 2, 2, 2, 4, 4, 5, 5, 5};

        int k[] = topKFrequent(arr,3);

        for(int i: k){
            System.out.println(i);
        }
    }

    public static int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i: nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }

        System.out.println(hm.keySet());

        int arr[] = new int[hm.size()];

        int c = 0;
        for(int i: hm.keySet()){

            if(hm.get(i) >= k){
                arr[c++] = i;
            }

        }

        return arr;

    }

}
