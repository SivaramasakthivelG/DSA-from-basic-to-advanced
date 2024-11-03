package BasicMathProblems;

public class ReverseAnArray {


    public static void main(String[] args) {

        int[] arr = {1,4,5,7};

        int[] sums = arr.clone();
        int n = sums.length-1;

        reverse(arr,sums,n);

        for (int i : arr) {
            System.out.print(i+" ");
        }

    }

    private static void reverse(int[] arr, int[] sums, int n) {
        if(n<0) return;

        reverse(arr,sums,n-1);

        arr[n] = sums[sums.length-1-n];

    }


}
