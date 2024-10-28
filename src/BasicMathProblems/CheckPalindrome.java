package BasicMathProblems;

public class CheckPalindrome {

    //Link : https://leetcode.com/problems/palindrome-number/submissions/1432343647/

    public static void main(String[] args) {

        /**
         * Used for leet code solution for handling negative numbers
         *  if(x < 0){
         *    return false;
         *   }
         */

        int  ans = reverse(679876389, 0);
        boolean  ans1 = isPalindrome(343);
        System.out.println(ans);
        System.out.println(ans1);


    }

    // by using recursion
    public static int reverse(int x, int res){
        if(x==0){
            return res;
        }

        return reverse(x/10,(x%10)+res*10);
    }

    // Using string builder
    public static boolean isPalindrome(int x) {

        if(x<0){
            return false;
        }
        int num = 0;

        String s = Integer.toString(x);

        StringBuilder sb = new StringBuilder(s);

        sb.reverse();

        return s.equals(sb.toString());
    }
}
