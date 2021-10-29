package Easy;

import java.io.*;

import static java.util.stream.Collectors.joining;

class Result8 {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        if(s.contains("PM") && !s.substring(0,2).equals("12")) {
            int hrs = 12 + Integer.parseInt(s.substring(0,2));
            String rem = s.substring(2,8);
            System.out.println(hrs + rem);
            return hrs + rem;
        }
        else {
            if(s.contains("AM") && s.substring(0,2).equals("12")) {
                String hrs = "00";
                String rem = s.substring(2,8);
                System.out.println(hrs + rem);
                return hrs + rem;
            }
            else
                System.out.println(s.substring(0,8));
        }

        return "";

    }

}

class TimeConversion {
    public static void main(String[] args) throws IOException {
        String s = "04:59:59AM";

        Result8.timeConversion(s);
    }
}
