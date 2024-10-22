package Others;

public class AllocateBooks {

    public static void main(String[] args) {

        int[] arr = {3,2,2,4,1,4};

        int k = 3;

        int start = -1;
        int end = 0;

        int subArr = 1;

        for(int i=0;i<arr.length;i++){
            start = Math.max(start,arr[i]);
            end += arr[i];
        }

        /**
         * we assign start to start, the start act as result
         * Iterate till loops break, which is subArr > k
         * get the answer if subArr == k
         */

        while(start <= end){
            subArr = splitCount(arr,start);
//            System.out.println(subArr);

            if(subArr == k){
                end--;
            }else if(subArr > k) {
                start++;
            }else {
                end--;
            }
        }
        System.out.println(start);



    }

    private static int splitCount(int[] arr, int max) {
        int sum =0,count =0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            if(sum > max){
                count++;
                sum = arr[i];
            }
        }
        return count+1;
    }

}
