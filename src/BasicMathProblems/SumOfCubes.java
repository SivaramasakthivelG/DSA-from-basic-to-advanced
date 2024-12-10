package BasicMathProblems;

public class SumOfCubes {

    // https://www.geeksforgeeks.org/problems/sum-of-first-n-terms5843/1

    public static void main(String[] args) {
        int value = 5;
        int sum = 0;
        sum = add(value, sum);
        System.out.println(sum);
    }


    public static int add(int a, int sum) {
        sum += a * a * a;

        if (a <= 0) {
            return sum;
        }

        return add(a-1, sum);
    }


    static long sumOfSeries(long n) {

        if (n <= 0) {
            return 0L;
        }
        //   sumOfSeries(n-1);
        //   sum += Math.pow(n,3);

        return (long) Math.pow(n, 3) + sumOfSeries(n - 1);
    }

}
