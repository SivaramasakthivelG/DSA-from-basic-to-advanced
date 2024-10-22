package Others;

public class Sample2 {

    public static void main(String[] args) {
        long value = 5;
        int sum = 0;
        sumOfSeries(value);
    }

    static long sumOfSeries(long n) {

        long sum = 0;
        // base case
        if (n <= 0) return 0L;

        sum = (long) Math.pow(n, 3) + sumOfSeries(n - 1);

        return sum;

    }

}
