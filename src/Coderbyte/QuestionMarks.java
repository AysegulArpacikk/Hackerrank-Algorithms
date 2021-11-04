package Coderbyte;

import java.util.*;
import java.io.*;

    class QuestionMarks1 {

    public static String QuestionsMarks(String str) {

        char[] ch = new char[str.length()];

        for(int i=0; i<str.length(); i++) {
            ch[i] = str.charAt(i);
        }

        for(int i=0; i<str.length(); i++) {
            if(Character.isDigit(ch[i])) {
                int qCount = 0;
                int sum = 0;
                for(int j=i+1; j<str.length(); j++) {
                    if(ch[j] == '?') { qCount++; }
                    if(Character.isDigit(ch[j])) {
                        sum = ch[i] + ch[j];
                        if(sum != 106 && qCount != 3) {
                            return "false";
                        }
                    }
                }
            }
        }

        return "true";
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(QuestionsMarks("acc?3??sss?5rr1??????3"));
    }

}
