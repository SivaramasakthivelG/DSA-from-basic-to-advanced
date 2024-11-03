package BasicMathProblems;

public class GCD_LCM {

    //gfg link : https://www.geeksforgeeks.org/problems/lcm-and-gcd4516/1

    public static void main(String[] args) {


        Long floor[] = lcmAndGcd(6L, 10L);



        System.out.println(floor[0]);
        System.out.println(floor[1]);


    }


    static Long[] lcmAndGcd(Long A , Long B) {

        //we have to find the biggest number between two
        // we have to perfrom euclidean algo


        long ans = 0;

        long big = A;
        long small = B;

        if(A<B){
            big = B;
            small = A;
        }

        while(big % small != 0){
            Long temv = big;
            big = small;
            small = temv - small ;
        }
        ans = small;

//        if(big%small == 0){
//            ans = big/small;
//        }

        Long arr[] = new Long[2];
        arr[0] = ans;

        Long lcm = (A*B) / arr[0];

        arr[1] = lcm;

        return arr;

    }



}
