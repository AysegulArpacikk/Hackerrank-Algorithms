package Coderbyte;
import java.util.*;
import java.io.*;

class Main {

    public static String CodelandUsernameValidation(String str) {

        if(str.length() < 4 || str.length() > 25) {
            return "false";
        }

        if(!Character.isLetter(str.charAt(0))) {
            return "false";
        }

        if(str.charAt(str.length() - 1) == '_') {
            return "false";
        }

        for(int i=0; i<str.length(); i++) {
            if(!Character.isLetterOrDigit(str.charAt(i)) && str.charAt(i) != '_') {
                return "false";
            }
        }

        return "true";
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(CodelandUsernameValidation(s.nextLine()));
    }

}