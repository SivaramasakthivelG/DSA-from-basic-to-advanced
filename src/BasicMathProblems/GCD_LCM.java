package BasicMathProblems;

public class GCD_LCM {

    //gfg link : https://www.geeksforgeeks.org/problems/lcm-and-gcd4516/1

    public static void main(String[] args) {


        Long floor[] = lcmAndGcd(6L, 10L);

        System.out.println(floor[0]); // gcd
        System.out.println(floor[1]); // lcm


    }


    static Long[] lcmAndGcd(Long A , Long B) {

        //euclidean algo

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

        Long arr[] = new Long[2];
        arr[0] = ans;

        Long lcm = (A*B) / arr[0];

        arr[1] = lcm;

        return arr;
    }

    // Do recursion for GCD



}
