package BasicMathProblems;

public class CountDigits {

    public static void main(String[] args) {

        int ans = evenlyDividesInt(45);
        int ans1 = evenlyDivides(45);

        System.out.println(ans);
        System.out.println(ans1);

    }

    private static int evenlyDividesInt(int N){

        int sum = N;
        int count = 0;

        while (sum > 0){

            //Get the last digit from the sum which is N
            int digL = sum % 10;

            sum /= 10;

            //Handle division by zero error and check for even division
            if(digL > 0 && N % digL == 0){
                count ++;
            }
        }
        return count;

    }

    static int evenlyDivides(int N){

        int count = 0;
        String str = String.valueOf(N);
        for(int i = 0; i<str.length(); i++){
            char myvar = str.charAt(i);

            //char myvar = '7';
            //int myint = myvar - '0'; // Result: 7 (ASCII value of '7' is 55, '0' is 48, so 55 - 48 = 7)

            int myint = myvar - '0';
            if(myint != 0 && N % myint == 0){
                count++;
            }
        }
        return count;
    }

}
