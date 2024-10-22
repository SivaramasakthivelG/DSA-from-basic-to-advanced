package Others;

public class Sample {


    public static void main(String[] args) {
        int value = 5;
        int sum = 0;
        sum = add(value, sum);
        System.out.println(sum);
    }

    public static int add(int a, int sum) {
        int b = a * a * a;
        sum += b;//constant 125
        if (a > 0) {
            a = a - 1;
         sum = add(a, sum);
        }
        return sum;
    }

}
