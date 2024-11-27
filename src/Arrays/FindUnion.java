package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class FindUnion {

    // https://www.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1?utm_source=youtube&utm_medium=collab_
    // striver_ytdescription&utm_campaign=union-of-two-sorted-arrays

    public static void main(String[] args) {

        int[] arr = {11, 99, 18, 5};
        int[] arr2 = {1, 9, 8, 3};



        findUnion(arr,arr2).forEach(element->{
            System.out.print(element + " ");
        });

        System.out.println();
        findUnionManual(arr,arr2,arr.length,arr2.length).forEach(i->{
            System.out.print(i + " ");
        });

    }
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {

        TreeSet hs = new TreeSet();

        for(int i: a){
            hs.add(i);
        }

        for(int i: b){
            hs.add(i);
        }

        return new ArrayList<>(hs);

    }

    //Manual method
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnionManual(int arr1[], int arr2[], int n, int m) {
        int i = 0, j = 0;

        HashSet<Integer> hash = new HashSet<>();
        ArrayList<Integer> arrList;

        while (i < n && j < m) {
            if (arr2[j] < arr1[i]) {
                hash.add(arr2[j]);
                j++;
            }
            else if(arr2[j] == arr1[i]) {
                hash.add(arr1[i]);
                i++;
                j++;
            } else {
                hash.add(arr1[i]);
                i++;
            }
        }

        while (i < n) {
            hash.add(arr1[i]);
            i++;
        }

        while (j < m) {
            hash.add(arr2[j]);
            j++;
        }

        arrList = new ArrayList<>(hash);

        Collections.sort(arrList);

        return arrList;
    }

}
