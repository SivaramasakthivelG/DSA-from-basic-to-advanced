package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseEachWord {

    public static void main(String[] args) {

        String sr = "Android is interesting";

        reverseWord(sr);
    }

    private static void reverseWord(String sr) {
        String[] words = sr.split(" ");

        List<String> wordList = new ArrayList<>();

        String temp = "";

       for(String word : words){
           for(int i=word.length()-1;i>=0;i--){
               temp += word.charAt(i);
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


}
