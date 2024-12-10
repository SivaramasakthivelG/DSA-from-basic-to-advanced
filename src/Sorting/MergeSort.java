package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class MergeSort {

    public static void main(String[] args) {

        int[] arr = {7,5,7,1,2,5,4};

        arr = mergeSort(arr);

        for (int i: arr){
            System.out.println(i);
        }
    }

    static int[] mergeSort(int arr[]) {
        if(arr.length == 1) return arr;

        int mid = arr.length / 2;
        int[] l = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] r = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(l,r);
    }

    //this merge pattern found in merge union sum
    static int[] merge(int[] first, int[] second){
        int i=0,k=0,j=0;

        int[] sorted = new int[first.length+second.length];


        while (i < first.length && j < second.length){
            if(first[i]<second[j]){
                sorted[k++] = first[i++];
            }else{
                sorted[k++] = second[j++];
            }
        }

        while (i < first.length){
            sorted[k++] = first[i++];
        }
        while (j < first.length)
            sorted[k++] = second[j++];

        return sorted;
    }
}
