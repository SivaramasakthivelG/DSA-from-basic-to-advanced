package BasicMathProblems;

public class SumOfAllDivisorsN {

    //Problem link: https://www.geeksforgeeks.org/problems/sum-of-all-divisors-from-1-to-n4738/1

    public static void main(String[] args) {

        int floor = (int) sumOfDivisors(5);
        int floors = (int) sumOfDivisors1(5);
        int floorss = (int) sumOfDivisors3(5);

        int recur = (int) countSum(5,1);

        System.out.println(recur);
        System.out.println(floor);
        System.out.println(floors);
        System.out.println(floorss);


    }

    //Its first level thinking idea, which is leads to TLE
    public static long sumOfDivisors(int n) {

        int ans = 0;

        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) ans += j;
            }
            ans += i;
        }
        return ans;
    }


    // Here the idea is n/i which is number of time the divisor divides the number upto N
    public static long sumOfDivisors1(int n) {

        long ans = 0;

        for (int i = 1; i <= n; i++) {
            ans += (long) (n / i) * i;
        }
        return ans;
    }

    //intuitive idea
    public static long sumOfDivisors3(int n) {

        long ans = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j += i) {
                ans += i;
            }
        }
        return ans;
    }

    //using recursion, this call is same as factorial recursion
    // Logic :  calculate the factor of 1 first, then up to n
    public static long countSum(int n,int i) {
        if (i > n) {
            return 0;
        }
        return (long) (n / i) * i + countSum(n, i + 1);
    }
}
