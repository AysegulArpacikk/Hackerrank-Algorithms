package Interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class InterviewQuestion {

    public static boolean isPowThree(int number) {
        boolean result = false;

        while(number != 1) {
            if (number % 3 == 0) {
                number = number / 3;
                if (number == 1) {
                    result = true;
                    break;
                }
            } else {
                break;
            }
        }

        System.out.println(result);
        return result;
    }

    public static boolean isPalindrome(String name) {
        boolean result = false;
        int ciftCount = 0;
        int tekCount = 0;
        char[] nameChars = name.toCharArray();
        HashMap<String, Integer> map = new HashMap<>();

        for (int i=0; i<name.length(); i++) {
            if (map.containsKey(String.valueOf(nameChars[i]))) {
                map.put(String.valueOf(nameChars[i]), map.get(String.valueOf(nameChars[i])) + 1);
            } else {
                map.put(String.valueOf(nameChars[i]), 1);
            }
        }

        for (int i=0; i<name.length(); i++) {
            if (map.get(String.valueOf(nameChars[i])) % 2 == 0) {
                ciftCount++;
            } else {
                tekCount++;
            }
        }

        if (ciftCount % 2 == 0 && tekCount == 1) {
            result = true;
        } else {
            result = false;
        }

        System.out.println(result);
        System.out.println(map);
        return result;
    }

    public static void main(String[] args) {
        //isPalindrome("bat");
        isPowThree(1);
    }

}
