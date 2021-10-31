package Coderbyte;

import java.util.*;
import java.io.*;

class LongestWord1 {

    public static String LongestWord(String sen) {
        String str[] = sen.split(" ");

        int max = 0;
        String maxStr = "";
        for( int i = 0; i < str.length; i++ ) {
            int wordCount = 0;
            for( int j = 0; j < str[i].length(); j++ ) {
                if( Character.isLetter(str[i].charAt(j) ) ) {
                    wordCount++;
                }
            }

            if( wordCount > max ) {
                max = wordCount;
                maxStr = str[i];
            }

        }

        return maxStr;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(LongestWord(s.nextLine()));
    }

}
