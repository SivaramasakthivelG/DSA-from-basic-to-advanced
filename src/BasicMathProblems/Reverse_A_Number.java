package BasicMathProblems;

public class Reverse_A_Number {

    // Problem Link : https://leetcode.com/problems/reverse-integer/description/


    public static void main(String[] args) {

        int  ans = reverse(679);
        int  ansStr = reverseWithString(679);
        System.out.println(ans);
        System.out.println(ansStr);

        long rev = recursiveRev(145,0);
        System.out.println(rev);

    }

    public static int reverse(int num) {
        long ans = 0;

        while(num != 0){
            int digL = num % 10;
            num /= 10;

            ans = digL + ans * 10;

            if(ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE){
                return 0;
            }
        }

        return (int)ans;

    }

    public static long recursiveRev(int x, long res){
        if(x==0){
            return res;
        }

        return recursiveRev(x/10,res*10 + (x%10));
    }

    public static int reverseWithString(int x) {

        int res=0;
        int x1=0;
        if(x<0){
            x1= x*-1;
        }else {
            x1=x;
        }
        //String num = Integer.toString(x);
        StringBuilder output = new StringBuilder();
        output.append(x1);
        try{
            res = Integer.parseInt(output.reverse().toString());
        }catch(NumberFormatException e){
            res = 0;
        }if (x<0){
            res = res * -1;
        }
        return res;
    }
}
