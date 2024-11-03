package BasicMathProblems;

public class Fibo {

    public static void main(String[] args) {


        int sums = fib(4);

        System.out.println(sums);



    }

    // it takes 8 ms, but conventional math method did it in 0ms
    public static int fib(int n) {
        //fibo of 0 is 0
        // fibo of 1 is 1

        if(n<=1) return n;

        return fib(n-1) + fib(n-2);

    }


}
