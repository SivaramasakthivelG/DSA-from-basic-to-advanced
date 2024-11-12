package Arrays;

public class SecondLargestNum {

    public static void main(String[] args) {

        int[] arr = {1, 1, 55, 77, 4, 75};

        int secL = secLargest(arr);

        System.out.println(secL);

    }

    public static int secLargest(int arr[]) {

        /**
         * Approach
         have two variables firH and secH
         foreach loop
         if the X less than first but greater than second , secH = X
         firH  = 0, can be easily done using if the  element > firH , firH = element
         */

        int firH = Integer.MIN_VALUE;
        int secH = Integer.MAX_VALUE;

        for (int i : arr) {
            if (i > firH) {
                secH = firH;
                firH = i;
            } else if (i < firH && i > secH) {
                secH = i;
            }
        }

        return secH;

    }


}
