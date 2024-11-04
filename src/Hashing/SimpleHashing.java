package Hashing;

import java.util.HashMap;

public class SimpleHashing {

    // problem link : https://www.geeksforgeeks.org/problems/frequency-of-array-elements-1587115620/0
    public static void main(String[] args){

        int[] arr = {13,2,2,4,1,4};

        frequencyCount(arr,6,8);
        frequencyCountHashing(arr,6,8);

        for(int i: arr){
            System.out.print(i+" ");
        }
    }


    public static void frequencyCount(int arr[], int N, int P) {

        //Let's do with hashMap

        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int x: arr){

            hm.put(x,hm.getOrDefault(x,0)+1);

        }

        for(int i=0;i<N;i++){
            arr[i] = hm.getOrDefault(i+1,0);
        }

    }

    //without hashmap
    public static void frequencyCountHashing(int arr[], int N, int P) {

        //Let's do with hashMap

        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int x: arr){

            hm.put(x,hm.getOrDefault(x,0)+1);

        }

        for(int i=0;i<N;i++){
            arr[i] = hm.getOrDefault(i+1,0);
        }

    }

}
