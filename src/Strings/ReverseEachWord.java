package Strings;

import java.util.*;

public class ReverseEachWord {

    // L557: https://leetcode.com/problems/reverse-words-in-a-string-iii/
    public static void main(String[] args) {

        String sr = "Android is interesting";

//        reverseWord(sr);
        reverseWordStack(sr);
    }

    private static void reverseWord(String sr) {
        String[] words = sr.split(" ");

        List<String> wordList = new ArrayList<>();

        String temp = "";

       for(String word : words){
           for(int i=0;i<word.length();i++){
               temp = word.charAt(i) + temp;
           }
           wordList.add(temp);
           temp = " ";
       }

        for (String s : wordList) {
            System.out.print(s+" ");
        }

        sr = "";
        for (String s : wordList) {
            sr += s;
        }
        System.out.print(sr);
    }

    private static void reverseWordStack(String sr) {
        StringBuilder s = new StringBuilder(sr);
        s.reverse();
        String[] words = s.toString().split(" ");

        Stack<String> wordStack = new Stack<>();

        // add each word to the stack
        // pop one by one till end

        for (String i: words){
            wordStack.push(i);
        }

        int i = 0;
        while (!wordStack.isEmpty()){
            words[i] = wordStack.pop();
            i++;
        }

        for (String ss : words) {
            System.out.print(ss+" ");
        }
    }


}
