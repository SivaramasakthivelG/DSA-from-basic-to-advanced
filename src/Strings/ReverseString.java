package Strings;

public class ReverseString {

    public static void main(String[] args) {

        char[] str = "raja is a good boy".toCharArray();
        int n = str.length-1;

        reverseString(str);
    }

    public static void reverseString(char[] s) {

        int n = s.length-1;

        // i holds the reversion
        // j used for indexing
        // we update both i and j to shrink the area we were working on
        for (int i = n,j = 0; j < i; i--,j++) {
            char temp = s[j];
            s[j] = s[i];
            s[i] = temp;
        }

        for (char c : s) {
            System.out.print(c);
        }

    }

}
