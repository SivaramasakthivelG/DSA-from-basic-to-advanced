package Recursion;

import java.util.ArrayList;

public class RecursionExample {

    public static void main(String[] args) {

        int[] arr = {1, 8, 7, 8};


        for (int i : findAllIndex11(arr,8,0)) {
            System.out.println(i);
        }
    }

    private static ArrayList<Integer> findAllIndex11(int[] arr, int target, int index) {
        ArrayList<Integer> ar = new ArrayList<>();
        if (index == arr.length) {
            return ar;
        }
        if (arr[index] == target) {
            ar.add(index);
        }
        ArrayList<Integer> arrk = findAllIndex11(arr, target, index + 1);
        ar.addAll(arrk);
        return ar;
    }

}
