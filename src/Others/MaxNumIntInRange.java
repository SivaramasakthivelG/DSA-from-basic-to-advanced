package Others;

import java.util.ArrayList;
import java.util.HashMap;

public class MaxNumIntInRange {

    public static void main(String[] args) {

        int[] arr = {11};
        int n = 7;
        int maxSum  = 50;

        int ans = maxCount(arr,n,maxSum);

        System.out.println(ans);

    }

    public static int maxCount(int[] banned, int n, int maxSum) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i: banned){
            hm.put(i,0);
        }

        for (int i = 1; i<=n;i++){
            if(!hm.containsKey(i)){
                arrayList.add(i);
            }
        }

        int sum = 0;
        for (int i : arrayList){
            if(sum < maxSum){
                sum += i;
            }

            if(sum>maxSum){
                sum -= i;
            }
        }



        int res = 0;
        for(int i=0;i<arrayList.size()-1;i++){
            for(int j = i+1;j<arrayList.size();j++){
                if(arrayList.get(i) + arrayList.get(j) <= maxSum){
                    res = arrayList.get(i) + arrayList.get(j);
                }
            }
        }


        return Math.max(res,sum);
    }

}
