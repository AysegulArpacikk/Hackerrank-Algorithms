package Easy;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.joining;

class Result20 {

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    //UD
    //UUDD
    //UUUDDD
    public static int countingValleys(int steps, String path) {
        int count = 0;
        List<Integer> arr = new ArrayList<>();

        for (int i=0; i<=path.length()-1; i++) {
            if (path.charAt(i) == 'U') {
                count++;
                arr.add(count);
            } else if (path.charAt(i) == 'D') {
                count--;
                arr.add(count);
            }
        }

        int valley = 0;
        for (int i=0; i<=arr.size()-1; i++) {
            if (i != 0 && arr.get(i) == 0 && arr.get(i-1) < 0) {
                valley++;
            }
        }

        System.out.println(arr);
        System.out.println(valley);

        return valley;

    }

}

public class CountingValleys {
    public static void main(String[] args) throws IOException {
        int steps = 8;

        String path = "UDDDUDUU";

        Result20.countingValleys(steps, path);
    }
}

