package Others;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] arr = new int[]{5, 7, 8, 3, 2, 6,4,1,99,0};
        int n = arr.length;
        int temp;

        for (int i = 0; i < n-1; i++) {
            if(arr[i+1]<arr[i]){
                for(int j=i;j>=0;j--){
                    if(arr[j+1]<arr[j]){
                        temp = arr[j+1];
                        arr[j+1] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }

        for(int i: arr){
            System.out.println(i);
        }

    }




}