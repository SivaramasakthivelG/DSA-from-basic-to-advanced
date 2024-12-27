package Strings;

public class Vowels {

    //zoho
    public static void main(String[] args) {

        String str = "Recursion";

        StringBuilder sr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if("aeiouAEIOU".indexOf(str.charAt(i)) != -1){
                if(str.charAt(i) < 97){
                    sr.append((str.charAt(i)));
                    sr.append(((char)(str.charAt(i)+32)));
                }else {
                    sr.append((str.charAt(i)));
                    sr.append((char)(str.charAt(i)-32));
                }
            }else {
                sr.append(str.charAt(i));
            }
        }
        System.out.println(sr);
    }

    public static void main5(String str) {

        StringBuilder sr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ("aeiouAEIOU".indexOf(ch) != -1) {
                sr.append(ch);
                sr.append((char) (ch >= 'a' ? ch - 32 : ch + 32));
            } else {
                sr.append(ch);
            }
        }

        System.out.println(sr);
    }

}
